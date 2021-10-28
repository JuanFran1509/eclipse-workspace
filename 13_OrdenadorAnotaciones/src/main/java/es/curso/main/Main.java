package es.curso.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.curso.cfg.ApplicationCfg;
import es.curso.entidad.Ordenador;
import es.curso.servicio.OrdenadorServicio;

public class Main {
	public static ApplicationContext context = null;
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		context = new AnnotationConfigApplicationContext(ApplicationCfg.class);
		Ordenador ordenador = context.getBean("ordenador", Ordenador.class);
		
		System.out.println(ordenador);
		
		OrdenadorServicio ordenadorServicio = context.getBean("ordenadorServicio", OrdenadorServicio.class);
		
		System.out.println(ordenadorServicio.guardarOrdenador(ordenador));
	}
}
