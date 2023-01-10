package br.com.alura.mvc.mudi.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String hello(Model model) {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("MacBook Air M1");
		pedido.setValorNegociado(new BigDecimal("6599"));
		pedido.setDataEntrega(LocalDate.now());
		pedido.setUrlImagem("https://http2.mlstatic.com/D_NQ_NP_801112-MLA46516512347_062021-O.webp");
		pedido.setUrlProduto("https://www.mercadolivre.com.br/apple-macbook-air-13-polegadas-2020-chip-m1-256-gb-de-ssd-8-gb-de-ram-ouro/p/MLB17828522?product_trigger_id=MLB17828523&quantity=1");		
		pedido.setDescricao("13 polegadas, 2020, Chip M1, 256 GB de SSD, 8 GB de RAM");
		
		List<Pedido> listaDePedidos = Arrays.asList(pedido);
		
		model.addAttribute("pedidos", listaDePedidos);
		
		return "hello";
	}
	
	
}
	