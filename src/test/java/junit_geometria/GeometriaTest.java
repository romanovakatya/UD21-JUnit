package junit_geometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.App;
import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {
	
	Geometria geometria;

	@Test
	public void testAreaCuadrado() {
		
		geometria = new Geometria(1);
		
		int resultado = geometria.areacuadrado(4);
		int esperado = 16;
		assertEquals(esperado, resultado);		
	}
	
	@Test
	public void testAreaCirculo() {
		
		geometria = new Geometria(2);
		
		double resultado = geometria.areaCirculo(5);
		double esperado = 78.54;
		double delta = 0.1;
		assertEquals(esperado, resultado, delta);		
	}
	
	@Test
	public void testAreaTriangulo() {
		geometria = new Geometria(3);
		
		int resultado = geometria.areatriangulo(3, 2);
		int esperado = 3;
		assertEquals(esperado, resultado);		
	}
	
	@Test
	public void testAreaRectangulo() {
		geometria = new Geometria(4);
		
		int resultado = geometria.arearectangulo(2, 4);
		int esperado = 8;
		assertEquals(esperado, resultado);		
	}
	
	@Test
	public void testAreaPentagono() {
		
		geometria = new Geometria(5);
		
		int resultado = geometria.areapentagono(3, 7);
		int esperado = 10;
		assertEquals(esperado, resultado);		
	}
	
	@Test
	public void testAreaRombo() {
		geometria = new Geometria(6);
		
		int resultado = geometria.arearombo(3, 3);
		int esperado = 4;
		assertEquals(esperado, resultado);		
	}
	
	@Test
	public void testAreaRomboide() {
		geometria = new Geometria(7);
		
		int resultado = geometria.arearomboide(6, 6);
		int esperado = 36;
		assertEquals(esperado, resultado);		
	}
	
	@Test
	public void testAreaTrapecio() {
		geometria = new Geometria(8);
		
		int resultado = geometria.areatrapecio(1, 2, 4);
		int esperado = 4;
		assertEquals(esperado, resultado);		
	}
	
	@Test
	public void testFigura() {
		
		geometria = new Geometria();
		
		String resultado = geometria.figura(9);
		String esperado = "Default";
		assertEquals(esperado, resultado);		
	}
	
	@Test
	public void testGetId() {
		
		geometria = new Geometria(8);
		
		int resultado = geometria.getId();
		int esperado = 8;
		assertEquals(esperado, resultado);		
	}

	@Test
	public void testSetId() {
		
		geometria = new Geometria();
		
		geometria.setId(11);
		int resultado = geometria.getId();
		int esperado = 11;
		assertEquals(esperado, resultado);		
	}
	
	@Test
	public void testGetNom() {
		
		geometria = new Geometria(4);
		
		String resultado = geometria.getNom();
		String esperado = "Rectangulo";
		assertEquals(esperado, resultado);		
	}
	
	@Test
	public void testSetNom() {
		
		geometria = new Geometria();
		
		geometria.setNom("FiguraNueva");
		String resultado = geometria.getNom();
		String esperado = "FiguraNueva";
		assertEquals(esperado, resultado);		
	}
	
	@Test
	public void testSetArea() {
		geometria = new Geometria(1);
		
		geometria.setArea(4.5);
		double resultado = geometria.getArea();
		double esperado = 4.5;
		double delta = 0.1;
		assertEquals(esperado, resultado, delta);
	}
	
	@Test
	public void testGetArea() {
		
		geometria = new Geometria(6);
		
		geometria.setArea(geometria.arearombo(3, 3));
		double resultado = geometria.getArea();
		double esperado = 4;
		double delta = 0.1;
		assertEquals(esperado, resultado, delta);		
	}
	
	@Test
	public void testToString() {
		
		geometria = new Geometria(3);
		
		geometria.setArea(geometria.areatriangulo(4, 8));
		
		String resultado = geometria.toString();
		String esperado = "Geometria [id=3, nom=Triangulo, area=16.0]";
		
		assertEquals(esperado, resultado);
	}
}
