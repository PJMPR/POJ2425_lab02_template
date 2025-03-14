package com.server.logic;

public class Server {
    private static final String[] serverNames = {"Alpha", "Beta", "Gamma", "Delta"};
    private static final double[][] serverStats = {
            {70.5, 60.2, 80.1}, // CPU użycie (%), RAM (%), Dysk (%), serwer 0
            {30.0, 40.0, 20.5}, // serwer 1
            {85.0, 90.5, 95.2}, // serwer 2
            {55.0, 50.0, 45.0}  // serwer 3
    };

    /**
     * Zwraca nazwę serwera na podstawie jego ID.
     * @param id Indeks serwera w tablicy.
     * @return Nazwa serwera lub "Nieznany serwer" jeśli ID jest niepoprawne.
     */
    public static String getServerName(int id) {
        return null;
    }

    /**
     * Zwraca statystyki serwera na podstawie jego ID.
     * @param id Indeks serwera w tablicy.
     * @return Tablica z wartościami CPU, RAM i Dysk, lub pusta tablica jeśli ID jest niepoprawne.
     */
    public static double[] getServerStats(int id) {
        return null;
    }

    /**
     * Wyszukuje indeks serwera na podstawie jego nazwy.
     * @param name Nazwa serwera.
     * @return Indeks serwera lub -1, jeśli serwer nie został znaleziony.
     */
    public static int findServerIndex(String name) {
        return -1;
    }
}
