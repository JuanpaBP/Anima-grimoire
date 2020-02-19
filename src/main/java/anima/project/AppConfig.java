package anima.project;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import anima.project.domain.ItemFactura;
import anima.project.domain.Producto;

@Configuration
public class AppConfig {

	@Bean("itemsFactura")
	public List<ItemFactura> registrarItemFactura() {
		Producto p1 = new Producto(1,"Medialunas", "Dulces", 35);
		Producto p2 = new Producto(2,"Cafe", "Jarrito", 55);
		Producto p3 = new Producto(3,"Smoothie", "Banana, durazno, pera o melón", 90);
		Producto p4 = new Producto(4,"Tostado", "Simple de jamón y queso", 100);
		Producto p5 = new Producto(5,"Tostado a la Pizza", "Jamon, queso y tomate, con cubierta de pizza", 160);
		
		ItemFactura linea1 = new ItemFactura(p1, 4);
		ItemFactura linea2 = new ItemFactura(p2, 1);
		ItemFactura linea3 = new ItemFactura(p3, 1);
		ItemFactura linea4 = new ItemFactura(p5, 2);
		
		return Arrays.asList(linea1, linea2, linea3, linea4);
		
	}
	
	@Bean("itemsFacturaTech")
	@Primary
	public List<ItemFactura> registrarItemFacturaTech()
	{
		Producto p1 = new Producto(1, "Monitor LG 24'", "144hz, 4k", 27500);
		Producto p2 = new Producto(2, "Gabinete Thermaltake", "Full Tower", 7900);
		Producto p3 = new Producto(3, "Teclado Blue CherryMX LZ2002", "Mecánico, cherry switches", 12540);
		Producto p4 = new Producto(4, "Micro Ryzen 9400", "8 nucleos físicos, 4 lógicos", 18400);
		Producto p5 = new Producto(5, "Stick de 8gb de ram", "HyperX", 7500);
		
		ItemFactura linea1 = new ItemFactura(p1, 2);
		ItemFactura linea2 = new ItemFactura(p2, 1);
		ItemFactura linea3 = new ItemFactura(p3, 1);
		ItemFactura linea4 = new ItemFactura(p4, 1);
		ItemFactura linea5 = new ItemFactura(p5, 4);
		
		return Arrays.asList(linea1, linea2, linea3, linea4, linea5);
	}
}
