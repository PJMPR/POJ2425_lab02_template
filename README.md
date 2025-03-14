# System Monitorowania Wydajności Serwerów

## Opis Projektu
Ten projekt implementuje statyczny system monitorowania wydajności serwerów. Program umożliwia:
- Pobieranie informacji o serwerach,
- Analizę średniego zużycia zasobów,
- Wykrywanie przeciążeń serwerów,
- Generowanie raportów wydajności.

Kod nie używa wyjątków – błędy są zgłaszane w postaci komunikatów na konsoli.

---

## Struktura Klas

### `Server`
Przechowuje dane o serwerach i ich statystykach.

#### Metody:
- `getServerName(int id) -> String` – Zwraca nazwę serwera.
- `getServerStats(int id) -> double[]` – Zwraca statystyki CPU, RAM, Dysk.
- `findServerIndex(String name) -> int` – Wyszukuje indeks serwera po nazwie.

### `PerformanceMonitor`
Analizuje średnie zużycie zasobów.

#### Metody:
- `getAverageUsage(int serverId) -> double` – Oblicza średnie zużycie CPU, RAM i dysku.

### `AlertSystem`
Wykrywa przeciążenia serwerów.

#### Metody:
- `isServerOverloaded(int serverId) -> boolean` – Sprawdza, czy którykolwiek z zasobów przekracza 90%.

### `ReportGenerator`
Generuje raporty wydajnościowe.

#### Metody:
- `generateReport() -> void` – Wypisuje na konsolę raport wydajnościowy.
