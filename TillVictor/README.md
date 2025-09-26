# Adapter Pattern
## Steckbrief
**Name:** Adapter (auch Hüllenklasse oder Wrapper)
**Art:** Strukturmuster
**Klassifikation:** klassen- oder objektbasiertes Strukturmuster
**Zweck:** Dient dazu zwei inkompatible Schnittstellen zu Verbinden
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
	Adapter["Übersetzer 
	SagHalloAufDeutsch()"]
	Adaptee["Chinese
	SagHalloAufChinesisch()"]
	Target["Deutscher
	SagHalloAufDeutsch()"]
	
	Client --> Target
	Adapter --> Target
	Adapter --> Adaptee
	
````
