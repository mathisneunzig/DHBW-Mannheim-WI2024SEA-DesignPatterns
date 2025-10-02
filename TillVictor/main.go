package main

import "fmt"

// Mikro USB Stecker unterstützt MikroUSBEinstecken
type MikroUSBStecker struct{}

func (a *MikroUSBStecker) MikroUSBEinstecken() {
	fmt.Println("Microsteckt drin")
}

// USB-C Stecker unterstützt USBCEinstecken
type usbcStecker struct{}

func (e *usbcStecker) USBCEinstecken() {
    fmt.Println("Echter USB-C steckt drin.")
}

// Der Adapter hat einen microUSbStecker und implementiert das Interface USBC
type Adapter struct {
	microUSBStecker *MikroUSBStecker
}

func (s *Adapter) USBCEinstecken() {
	s.microUSBStecker.MikroUSBEinstecken()
}

// Dieses Interface kennt der Client und verwendet es um Stecker einzustecken
type USBCStecker interface {
	USBCEinstecken()
}


//Die Funktion erwartet ein Usbc-Gerät und Steckt dann den USBC Stecker ein
type Client struct{}

func (c *Client) SteckerEinstecken(stecker USBCStecker){
    stecker.USBCEinstecken()
}

func main() {
    //Der Client möchte gerne alle seine Stecker einstecken, 
    //kennt aber nur das Interface USBCStecker mit der Funktion USBC-Einstecken
    Client := &Client{}

    //seinen neuen USBC Stecker kann er Problemlos einstecken...
    var usbcStecker *usbcStecker
    Client.SteckerEinstecken(usbcStecker)

    //aber beim Versuch seinen alten microUSB Stecker einzustecken gibt es einen Fehler...
    var microUSBStecker *MikroUSBStecker
    Client.SteckerEinstecken(microUSBStecker)

    //Deswegen steckt er seinen alten Mikro USB stecker in den Adapter und versucht es nochmal
    adapter := &Adapter{microUSBStecker: microUSBStecker}
    Client.SteckerEinstecken(adapter)

    //Jetzt gibt es keinen Fehler mehr und das einstecken Funktioniert auch mit dem Mikro-USB Stecker
}
