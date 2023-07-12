## Technologie Aplikacji Webowych - projekt zaliczeniowy: raport
<br>

### 1. Wprowadzenie wszystkich przedmiotów do systemu w odpowiedniej kolejności: 

* **Metodologie obiektowe**
```
Metoda: POST
Adres zasobu: http://localhost:8080/api/przedmioty 
Nagłówki: Content-Type: application/json
Request Body:
{
	"Nazwa": "Metodologie obiektowe",
	"ECTS":2,
	"Sala":216,
	"Egzamin":"tak"
}
Response:
HTTP Code: 200 OK
Body: brak
```
* **Testowanie oprogramowania**
```
Metoda: POST
Adres zasobu: http://localhost:8080/api/przedmioty 
Nagłówki: Content-Type: application/json
Request Body: 
{
	"Nazwa": "Testowanie oprogramowania",
	"ECTS":1,
	"Sala":216,
	"Egzamin":"nie"
}
Response:
HTTP Code: 200 OK
Body: brak
 ```
* **Technologie i aplikacje webowe**
```
Metoda: POST
Adres zasobu: http://localhost:8080/api/przedmioty 
Nagłówki: Content-Type: application/json
Request Body: 
{
	"Nazwa": "Technologie i aplikacje webowe",
	"ECTS":3,
	"Sala":208,
	"Egzamin":"nie"
}
Response:
HTTP Code: 200 OK
Body: brak
```
* **Zarządzanie projektem informatycznym**
```
Metoda: POST
Adres zasobu: http://localhost:8080/api/przedmioty 
Nagłówki: Content-Type: application/json
Request Body: 
{
	"Nazwa": "Zarządzanie projektem informatycznym",
	"ECTS":2,
	"Sala":216,
	"Egzamin":"nie"
}
Response:
HTTP Code: 200 OK
Body: brak
```
* **Zaawansowane technologie bazodanowe**
```
Metoda: POST
Adres zasobu: http://localhost:8080/api/przedmioty 
Nagłówki: Content-Type: application/json
Request Body: 
{
	"Nazwa": "Zaawansowane technologie bazodanowe",
	"ECTS":3,
	"Sala":208,
	"Egzamin":"nie"
}
Response:
HTTP Code: 200 OK
Body: brak
```
* **Technologie komponentowe i sieciowe**
```
Metoda: POST
Adres zasobu: http://localhost:8080/api/przedmioty 
Nagłówki: Content-Type: application/json
Request Body: 
{
	"Nazwa": "Technologie komponentowe i sieciowe",
	"ECTS":2,
	"Sala":208,
	"Egzamin":"tak"
}
Response:
HTTP Code: 200 OK
Body: brak 
  ```


### 2. Pobranie wszystkich przedmiotów:
```
Metoda: GET
Adres zasobu: http://localhost:8080/api/przedmioty 
Nagłówki: Content-Type: application/json
Response:
HTTP Code: 200 OK
Body: 
[
	{
		"Nazwa": "Metodologie obiektowe",
		"ECTS": 2,
		"Sala": 216,
		"Egzamin": "tak",
		"Id": 1
	},
	{
		"Nazwa": "Testowanie oprogramowania",
		"ECTS": 1,
		"Sala": 216,
		"Egzamin": "nie",
		"Id": 2
	},
	{
		"Nazwa": "Technologie i aplikacje webowe",
		"ECTS": 3,
		"Sala": 208,
		"Egzamin": "nie",
		"Id": 3
	},
	{
		"Nazwa": "Zarządzanie projektem informatycznym",
		"ECTS": 2,
		"Sala": 216,
		"Egzamin": "nie",
		"Id": 4
	},
	{
		"Nazwa": "Zaawansowane technologie bazodanowe",
		"ECTS": 3,
		"Sala": 208,
		"Egzamin": "nie",
		"Id": 5
	},
	{
		"Nazwa": "Technologie komponentowe i sieciowe",
		"ECTS": 2,
		"Sala": 208,
		"Egzamin": "tak",
		"Id": 6
	}
]
```

### 3. Pobranie wszystkich przedmiotów, które mają egzamin:
```
Metoda: GET
Adres zasobu: http://localhost:8080/api/przedmioty?egzamin=tak 
Nagłówki: Content-Type: application/json
Query: name: egzamin, value: tak
Response:
HTTP Code: 200 OK
Body: 
[
	{
		"Nazwa": "Metodologie obiektowe",
		"ECTS": 2,
		"Sala": 216,
		"Egzamin": "tak",
		"Id": 1
	},
	{
		"Nazwa": "Technologie komponentowe i sieciowe",
		"ECTS": 2,
		"Sala": 208,
		"Egzamin": "tak",
		"Id": 6
	}
]
```
### 4. Pobranie wszystkich przedmiotów, które odbywają się w sali 216
```
Metoda: GET
Adres zasobu: http://localhost:8080/api/przedmioty?sala=216 
Nagłówki: Content-Type: application/json
Query: name: sala, value: 216
Response:
HTTP Code: 200 OK
Body: 
[
	{
		"Nazwa": "Metodologie obiektowe",
		"ECTS": 2,
		"Sala": 216,
		"Egzamin": "tak",
		"Id": 1
	},
	{
		"Nazwa": "Testowanie oprogramowania",
		"ECTS": 1,
		"Sala": 216,
		"Egzamin": "nie",
		"Id": 2
	},
	{
		"Nazwa": "Zarządzanie projektem informatycznym",
		"ECTS": 2,
		"Sala": 216,
		"Egzamin": "nie",
		"Id": 4
	}
]
```
### 5.  Pobranie wszystkich przedmiotów, które nie mają egzaminu i odbywają się w sali 208:
```
Metoda: GET
Adres zasobu: http://localhost:8080/api/przedmioty?sala=208&egzamin=nie 
Nagłówki: Content-Type: application/json
Query: name: egzamin, value: nie; name: sala, value: 208
Response:
HTTP Code: 200 OK
Body: 
[
	{
		"Nazwa": "Technologie i aplikacje webowe",
		"ECTS": 3,
		"Sala": 208,
		"Egzamin": "nie",
		"Id": 3
	},
	{
		"Nazwa": "Zaawansowane technologie bazodanowe",
		"ECTS": 3,
		"Sala": 208,
		"Egzamin": "nie",
		"Id": 5
	}
]
```
### 6. Pobranie przedmiotu o identyfikatorze 3:
```
Metoda: GET
Adres zasobu: http://localhost:8080/api/przedmioty/3 
Nagłówki: Content-Type: application/json
Response:
HTTP Code: 200 OK
Body: 
{
	"Nazwa": "Technologie i aplikacje webowe",
	"ECTS": 3,
	"Sala": 208,
	"Egzamin": "nie",
	"Id": 3
}
```
### 7. Pobranie przedmiotu o identyfikatorze 15:
```
Metoda: GET
Adres zasobu: http://localhost:8080/api/przedmioty/15 
Nagłówki: Content-Type: application/json
Response:
HTTP Code: 404 Not Found
Body: Brak-przedmiotu-o-takim-id.
```
### 8. Usunięcie przedmiotu o identyfikatorze 2:
```
Metoda: DELETE
Adres zasobu: http://localhost:8080/api/przedmioty/2 
Nagłówki: Content-Type: application/json
Response:
HTTP Code: 200 OK
Body: brak
```

### 9. Pobranie wszystkich przedmiotów
```
Metoda: GET
Adres zasobu: http://localhost:8080/api/przedmioty 
Nagłówki: Content-Type: application/json
Response:
HTTP Code: 200 OK
Body:
[
	{
		"Nazwa": "Metodologie obiektowe",
		"ECTS": 2,
		"Sala": 216,
		"Egzamin": "tak",
		"Id": 1
	},
	{
		"Nazwa": "Technologie i aplikacje webowe",
		"ECTS": 3,
		"Sala": 208,
		"Egzamin": "nie",
		"Id": 3
	},
	{
		"Nazwa": "Zarządzanie projektem informatycznym",
		"ECTS": 2,
		"Sala": 216,
		"Egzamin": "nie",
		"Id": 4
	},
	{
		"Nazwa": "Zaawansowane technologie bazodanowe",
		"ECTS": 3,
		"Sala": 208,
		"Egzamin": "nie",
		"Id": 5
	},
	{
		"Nazwa": "Technologie komponentowe i sieciowe",
		"ECTS": 2,
		"Sala": 208,
		"Egzamin": "tak",
		"Id": 6
	}
]
```
### 10. Usunięcie wszystkich przedmiotów:
```
Metoda: DELETE
Adres zasobu: http://localhost:8080/api/przedmioty
Nagłówki: Content-Type: application/json
Response:
HTTP Code: 200 OK
Body: brak
```
### 11. Pobranie wszystkich przedmiotów
```
Metoda: GET
Adres zasobu: http://localhost:8080/api/przedmioty
Nagłówki: Content-Type: application/json
Response:
HTTP Code: 200 OK
Body: []
```