package br.com.grocerycloud.grocerycloud.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.grocerycloud.grocerycloud.negocio.excecoes.vendas.VendaNaoEncontradaException;
import br.com.grocerycloud.grocerycloud.negocio.fachada.FachadaGerente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


/** 
 * Esta classe representa o controlador de venda da gerencia.
 * @author Arthur de Sá Tenório
 * @category Classe de controlador da aplicação
*/

@Controller
@RequestMapping("/admin/venda")
public class ControladorAdminVenda {
    @Autowired
    private FachadaGerente fachadaGerente;

    @GetMapping("/")
    public ModelAndView homeAdminVenda() {
        ModelAndView mv = new ModelAndView("admin/venda/vendas");
        mv.addObject("vendas", fachadaGerente.listarVendas());
        return mv;
    }
    
    @GetMapping("/id/{id}")
    public ModelAndView buscarVenda(@PathVariable("id") long idVenda){
        ModelAndView mv = new ModelAndView("admin/venda/vendas");
        try {
            mv.addObject("vendas", fachadaGerente.listarVendaPorId(idVenda));
        }
        catch (VendaNaoEncontradaException err){
            mv.setViewName("geral/erro");
            mv.addObject("erro", err.getMessage());
        }
        return mv;
    }

    @GetMapping("/{id}")
    public ModelAndView detalharVenda(@PathVariable("id") long idVenda) {
        ModelAndView mv = new ModelAndView("/admin/venda/vendaDetalhada");
        try {
            mv.addObject("venda", fachadaGerente.listarVendaPorId(idVenda));
        }
        catch (VendaNaoEncontradaException err){
            mv.setViewName("geral/erro");
            mv.addObject("erro", err.getMessage());
        }
        return mv;
    }
}
