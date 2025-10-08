package main

import "fmt"

// Mikro USB Stecker unterstützt MikroUSBEinstecken
type MikroUSBStecker struct{}

func (a *MikroUSBStecker) MikroUSBEinstecken() {
	fmt.Println("Mikro USB Stecker steckt drin.")
}

// USB-C Stecker unterstützt USBCEinstecken
type USBCStecker struct{}

func (e *USBCStecker) USBCEinstecken() {
	fmt.Println("Echter USB-C Stecker steckt drin.")
}

// Der Adapter hat einen mikroUSbStecker und implementiert das Interface IUSBCStecker
type Adapter struct {
	mikroUSBStecker *MikroUSBStecker
}

func (s *Adapter) USBCEinstecken() {
	fmt.Println("Stecke Mikro USB Stecker in den Adapter...")
	s.mikroUSBStecker.MikroUSBEinstecken()
}

// Dieses Interface kennt der Client und verwendet es um Stecker einzustecken
type IUSBCStecker interface {
	USBCEinstecken()
}

// Die Funktion erwartet ein Usbc-Gerät und Steckt dann den USBC Stecker ein
type Client struct {
	MikroUSBStecker *MikroUSBStecker
	USBCStecker     *USBCStecker
}

func (c *Client) SteckerEinstecken(stecker IUSBCStecker) {
	stecker.USBCEinstecken()
}

func main() {
	//Der Client möchte gerne alle seine Stecker einstecken,
	//kennt aber nur das Interface IUSBCStecker mit der Funktion USBC-Einstecken
	Client := &Client{
		MikroUSBStecker: &MikroUSBStecker{},
		USBCStecker:     &USBCStecker{},
	}

	//seinen neuen USBC Stecker kann er Problemlos einstecken...
	Client.SteckerEinstecken(Client.USBCStecker)

	//aber beim Versuch seinen alten mikroUSB Stecker einzustecken gibt es einen Fehler...
	//Client.SteckerEinstecken(Client.MikroUSBStecker) würde einen Fehler werfen,
	// weil MikroUSBStecker das Interface IUSBCStecker nicht implementiert

	//Deswegen steckt er seinen alten Mikro USB stecker in den Adapter und versucht es nochmal
	adapter := &Adapter{mikroUSBStecker: Client.MikroUSBStecker}
	Client.SteckerEinstecken(adapter)

	//Jetzt gibt es keinen Fehler mehr und das einstecken Funktioniert auch mit dem Mikro-USB Stecker
}
