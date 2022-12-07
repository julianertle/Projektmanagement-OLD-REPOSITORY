package com.example.pmt_theatercomedy_gruppg;

import java.time.LocalDateTime;
import java.util.*;

public class Veranstaltung {
	private LocalDateTime zeit;
	private int anzahlPlatz;
	private int dauer;
	private Collection<Veranstaltungsort> veranstaltungsort;
	private Collection<Ticket> tickets;

}