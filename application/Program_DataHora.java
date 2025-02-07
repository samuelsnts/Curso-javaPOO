package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program_DataHora {

	public static void main(String[] args) {
		
		//Instantiation
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-05-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-05-20T04:50:23");
		Instant d06 = Instant.parse("2022-05-20T04:50:23Z");
		Instant d07 = Instant.parse("2022-05-20T04:50:23-03:00");
		
		LocalDate d08 = LocalDate.parse("20/04/2002", fmt1);
		LocalDateTime d09 = LocalDateTime.parse("20/04/2002 04:50", fmt2);
		
		LocalDate d10 = LocalDate.of(2023, 04, 10);
		LocalDateTime d11 = LocalDateTime.of(2023, 04, 10, 15, 57);
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);
		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		System.out.println("-----------------------------------------------------");
		//Formatting
		
		LocalDate d12 = LocalDate.parse("2022-05-20");
		LocalDateTime d13 = LocalDateTime.parse("2022-05-20T04:50:23");
		Instant d14 = Instant.parse("2022-05-20T04:50:23Z");
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 
		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		
		System.out.println("d12 = " + d12.format(fmt3));
		System.out.println("d13 = " + d13.format(fmt4));
		System.out.println("d14 = " + fmt5.format(d14));
		System.out.println("-----------------------------------------------------");
		//Operations date time
		
		LocalDate r1 = LocalDate.ofInstant(d14, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d14, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d14, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d14, ZoneId.of("Portugal"));
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		System.out.println("d12 dia = "+ d12.getDayOfMonth());
		System.out.println("d12 mes = "+ d12.getMonthValue());
		System.out.println("d12 ano = "+ d12.getYear());
		System.out.println("d13 hora = "+ d13.getHour());
		System.out.println("d13 minutos = "+ d13.getMinute());



		
		LocalDate pastWeekLocalDate = d12.minusDays(7);
		LocalDate nextWeekLocalDate = d12.plusDays(7);
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d13.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d13.plusDays(7);
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		
		Instant pastWeekInstant = d14.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d14.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		System.out.println("-----------------------------------------------------");

		
		
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d12.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d13);
		
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		
	}

}
