# Technische Dokumentation für die REST-API

## Einleitung

Die vorliegende Dokumentation beschreibt die RESTful-API für den Star Wars Webservice. Die API ermöglicht die
Interaktion mit dem
System über das HTTP-Protokoll und erlaubt den Austausch von Ressourcen und Daten in einem maschinenlesbaren
JSON-Format.  
Dieses Dokument bietet eine detaillierte Beschreibung der verfügbaren Endpunkte, Parameter, und möglichen Fehlercodes.

## API-Endpunkte

Die REST-API vom Star Wars Webservice stellt verschiedene Endpunkte zur Verfügung, um unterschiedliche Funktionen zu
unterstützen. Im
Folgenden werden die wichtigsten Endpunkte und ihre Funktionen beschrieben:

### Ressourcen abrufen

Grundsätzlich wird die RESTful API über den ```http://localhost:8080``` angesprochen.

1. Filme  
   GET /movie - Gibt eine Liste aller gespeicherten Filme zurück.  
   GET /movie/get/{id} - Gibt einen spezifischen Film anhand seiner ID zurück.
2. Charaktere  
   GET /character - Gibt eine Liste aller gespeicherten Charaktere zurück.  
   GET /character/get/{id} - Gibt einen spezifischen Charakter anhand seiner ID zurück.
3. Planeten  
   GET /planet - Gibt eine Liste aller gespeicherten Planeten zurück.  
   GET /planet/{id} - Gibt einen spezifischen Planeten anhand seiner ID zurück.
4. Spezien  
   GET /species - Gibt eine Lister aller gespeicherten Spezien zurück.  
   GET /species/{id} - Gibt eine spezifische Spezies anhand ihrer ID zurück.
5. Raumschiffe  
   GET /starship - Gibt eine Liste aller gespeicherten Raumschiffe zurück.  
   GET /starship/get/{id} - Gibt ein spezifisches Raumschiff anhand seiner ID zurück.
6. Vehikel  
   GET /vehicle - Gibt eine Liste aller gespeicherten Vehikel zurück.  
   GET /vehicle/{id} - Gibt ein spezifisches Vehikel anhand seiner ID zurück.

### Ressourcen erstellen

Bei einem POST wird jeweils eine neue Interaktion in der API ausgelöst, wodurch in der Datenbank ein neuer Eintrag
entsprechend
dem angesprochenen Endpunkt erstellt wird. Hierfür ist es immer notwendig, dass im Body der Anfrage alle erforderlichen
Daten
im JSON-Format bereitgestellt werden.

1. Filme  
   POST /movie/create - Erstellt einen neuen Film und speichert diesen in der Datenbank.  
   POST /movie/masscreate - Erstellt und speichert einen Film für jeden Eintrag in der, im Body befindlichen, Liste.
2. Charaktere
   POST /people/create - Erstellt einen neuen Charakter und speichert diesen in der Datenbank.   
   POST /people/masscreate - Erstellt und speichert einen Charakter für jeden Eintrag in der, im Body befindlichen,
   Liste.
3. Planeten
POST /planet/create - Erstellt einen neuen Planeten und speichert diesen in der Datenbank.   
      POST /planet/masscreate - Erstellt und speichert einen Planeten für jeden Eintrag in der, im Body befindlichen,
      Liste.
4. Spezien
   POST /species/create - Erstellt eine neue Spezies und speichert diese in der Datenbank.   
   POST /species/masscreate - Erstellt und speichert eine Spezies für jeden Eintrag in der, im Body befindlichen,
   Liste.
5. Raumschiffe
   POST /starship/create - Erstellt ein neues Raumschiff und speichert dieses in der Datenbank.   
   POST /starship/masscreate - Erstellt und speichert ein Raumschiff für jeden Eintrag in der, im Body befindlichen,
   Liste.
6. Vehikel
   POST /vehicle/create - Erstellt ein neues Vehikel und speichert diesen in der Datenbank.   
   POST /vehicle/masscreate - Erstellt und speichert ein Vehikel für jeden Eintrag in der, im Body befindlichen,
   Liste.

### Ressourcen löschen

1. Filme  
   DELETE /movie/delete/{id} - Löscht einen Film und aktualisiert die Datenbank. Eine ID zur Identifikation muss in der 
    URL übergeben werden.
2. Charaktere
   DELETE /people/delete/{id} - Löscht einen Charakter und aktualisiert die Datenbank. Eine ID zur Identifikation muss in der
   URL übergeben werden.
3. Planeten
   DELETE /planet/delete/{id} - Löscht einen Planeten und aktualisiert die Datenbank. Eine ID zur Identifikation muss in der
   URL übergeben werden.
4. Spezien
   DELETE /species/delete/{id} - Löscht eine Spezies und aktualisiert die Datenbank. Eine ID zur Identifikation muss in der
   URL übergeben werden.
5. Raumschiffe
   DELETE /starship/delete/{id} - Löscht ein Raumschiff und aktualisiert die Datenbank. Eine ID zur Identifikation muss in der
   URL übergeben werden.
6. Vehikel
   DELETE /vehicle/delete/{id} - Löscht ein Vehikel und aktualisiert die Datenbank. Eine ID zur Identifikation muss in der
   URL übergeben werden.

### Ressourcen zugreifen können.
Ein Zugriff auf die Restful API ist im moment ohne weitere Authentifizierung möglich.

## Fehlerbehandlung

Die API kann bisher einen Fehlercode zurückgeben, um den Client über den Status einer Anfrage zu informieren.
Hier ist der möglichen Fehlercodes und seine Bedeutungen:
500 Internal Server Error - Ein interner Serverfehler ist aufgetreten, eine Referenz für ein Objekt konnte in der 
Datenbank nicht gefunden werden.  
Im Fehlerfall gibt die API eine Fehlermeldung im JSON-Format zurück, um weitere Details zum Fehler bereitzustellen.