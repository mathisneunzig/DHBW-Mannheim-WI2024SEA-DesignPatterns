# Adapter Pattern
## Steckbrief
**Name:** Adapter (auch Hüllenklasse oder Wrapper) <br>
**Art:** Strukturmuster<br>
**Klassifikation:** klassen- oder objektbasiertes Strukturmuster<br>
**Zweck:** Dient dazu zwei inkompatible Schnittstellen zu Verbinden<br>
**Struktur:**
````mermaid
flowchart
	Client
	Adapter["Adapter 
	request()"]
	Adaptee["Adaptee
	specificRequest()"]
	Target["Target
	request()"]
	
	Client --> Target
	Adapter --> Target
	Adapter --> Adaptee
	
````
- das Target ist die Schnittstelle welche vom Client genutzt wird
- der Adapter implementiert diese Schnittstelle und leitet den Aufruf an den nicht kompatiblen specificRequest() des Adaptees weiter
- Dadurch kann der Client den Adaptee verwenden obwohl er nur die Schnittstelle aufruft, die er kennt

## Vorteile & Nachteile

| Pro                                                                              | Con                                                                                    |
| -------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| - Ermöglicht die Wiederververwendbarkeit von Code trotz fehlender Kompatibilität | - kann bei wenigen oder kleinen Schnittstellen schnell unnötige Komplexität hinzufügen |
|                                                                                  | - Ineffizienter durch eine dritte Instanz in der Mitte                                 |
|                                                                                  |                                                                                        |

## Einsatzgebiete
- Einbindung von nicht direkt kompatiblen Bibliotheken
- Einbindung von alten, nicht mehr kompatiblen, Technologien

## Warum existiert das Pattern

## Codebeispiel
- kann in der main.go über `go run main.go` ausgeführt werden.
- Pattern Struktur auf unser Codebeispiel angewendet:
````mermaid
flowchart
	Client
	Adapter["Adapter 
	USBCEinstecken()"]
	Adaptee["MikroUSBStecker
	mikroUSBEinstecken()"]
	Target["IUSBCStecker
	USBCEinstecken()"]
	
	Client --> Target
	Adapter --> Target
	Adapter --> Adaptee
	
````

<img width="742" height="348" alt="grafik" src="https://github.com/user-attachments/assets/e7fbf091-711f-4c81-a29e-f2476161e181" />

