package locadora;

import java.util.Calendar;
import java.util.List;

import locadora.Model.DAO.ClienteDAO;
import locadora.Model.DAO.DiscoDAO;
import locadora.Model.DAO.LivroDAO;
import locadora.Model.DAO.LocacaoDAO;
import locadora.Model.DAO.UsuarioDAO;
import locadora.Model.VO.ClienteVO;
import locadora.Model.VO.DiscoVO;
import locadora.Model.VO.LivroVO;
import locadora.Model.VO.LocacaoVO;
import locadora.Model.VO.UsuarioVO;

public class TesteConn {
	public static void main(String[] args) {

		// ----------- TESTE CLIENTE ------------
		ClienteDAO<ClienteVO> clidao = new ClienteDAO<ClienteVO>();
		ClienteVO cli = new ClienteVO();
		ClienteVO cli5 = new ClienteVO();

		 cli.setIdCliente(15L);
		 cli.setNome("Matheus Goes");
		 cli.setCpf("987.654.321-00");
		 cli.setTelefone("(85) 9.9999-9999");
		 cli.setEndereco("Rua Ceara, 404 - Casa 08 - Ceara");

		// clidao.alterar(cli);
		// clidao.inserir(cli);
		// clidao.listar();
		// clidao.removerById(cli);
		// cli5.setCpf("124.770.248-10");
		// clidao.removerByCPF(cli5);
		// Para buscar e mostrar o cliente pelo cpf
		// clidao.buscar(cli5);
		// System.out.println(cli5);

		//List<ClienteVO> clientes = clidao.listar();
		//for (ClienteVO cli2 : clientes) {
			// System.out.println(cli2);
		//	System.out.println(cli2.getIdCliente() + "\t" + cli2.getCpf() + "\t" + cli2.getNome() + "\t"
			//		+ cli2.getTelefone() + "\t" + cli2.getEndereco());

		//}

		// ----------- TESTE USU�RIO ------------
		UsuarioDAO usudao = new UsuarioDAO();
		UsuarioVO usu = new UsuarioVO();

		// usu.setIdUsuario(5L);
		// usu.setLogin("Matheus Goes");
		// usu.setSenha("123456");
		// usu.setPerfil(1);

		// usudao.inserir(usu);
		// usudao.alterar(usu);
		// usudao.removerById(usu);

		// Para buscar e mostrar o cliente
		// usudao.buscar(usu5);

		//List<UsuarioVO> usuarios = usudao.listar();
		//for (UsuarioVO usu2 : usuarios) {
			//System.out.println(usu2);
			//System.out.println(
				//	usu2.getIdUsuario() + "\t" + usu2.getLogin() + "\t" + usu2.getSenha() + "\t" + usu2.getPerfil());
		//}

		// ---------- TESTE DISCO ------------
		DiscoDAO discdao = new DiscoDAO();
		DiscoVO disc = new DiscoVO();

		// disc.setIdProduto(5L);
		// disc.setTitulo("Alagados");
		// disc.setNomeDaBanda("Paralamas");
		// disc.setGenero("Rock Progressivo");
		// disc.setAnoDeLancamento(1990);
		// disc.setQtdExemplares(1);
		// disc.setValorDoAlulguel(7.5);

		// Para mudar o valor do aluguel a partir do id
		// DiscoVO disc5 = new DiscoVO();
		// disc5.setIdProduto(9L);
		// disc5.setValorDoAlulguel(8.9);

		// discdao.inserir(disc);
		// discdao.alterarValor(disc5);
		// discdao.alterarQuantidade(disc);
		// discdao.removerById(disc5);

		// Para buscar e mostrar o disco
		// disc5.setIdProduto(5L);
		// discdao.buscar(disc5);
		// System.out.println(disc5);

	//	List<DiscoVO> discos = discdao.listar();
	//	for (DiscoVO disc2 : discos) {
	//		// System.out.println(disc2);
	//		System.out.println(disc2.getIdProduto() + "\t" + disc2.getTitulo() + "\t" + disc2.getNomeDaBanda() + "\t"
	//				+ disc2.getGenero() + "\t" + disc2.getAnoDeLancamento() + "\t" + disc2.getQtdExemplares() + "\t"
	//				+ disc.getValorDoAluguel());
	//	}

		// ---------- TESTE LIVRO ------------
		LivroDAO livdao = new LivroDAO();
		LivroVO liv = new LivroVO();

		// liv.setIdProduto(4L);
		// liv.setTitulo("A Ilha do Tesouro");
		// liv.setAutor("R. N. Stevenson");
		// liv.setGenero("Aventura");
		// liv.setAnoDeLancamento(2019);
		// liv.setQtdExemplares(1);
		// liv.setQtdPaginas(368);
		// liv.setValorDoAlulguel(12.5);

		// livdao.inserir(liv);
		// livdao.alterarValor(disc);
		// livdao.alterarQuantidade(disc);
		// livdao.removerById(disc);

		// Buscar o livro pelo IdProduto
		// LivroVO liv5 = new LivroVO();
		// liv5.setIdProduto(5L);
		// livdao.buscar(liv5);
		// System.out.println(liv5);

	//	List<LivroVO> livros = livdao.listar();
	//	for (LivroVO liv2 : livros) {
			// System.out.println(liv2);
	//		System.out.println(liv2.getIdProduto() + "\t" + liv2.getTitulo() + "\t" + liv2.getAutor() + "\t"
	//				+ liv2.getGenero() + "\t" + liv2.getAnoDeLancamento() + "\t" + liv2.getQtdExemplares() + "\t"
	//				+ liv2.getQtdPaginas() + "\t" + liv2.getValorDoAluguel());
	//	}

		// ---------- TESTE LOCA��O ------------
		LocacaoDAO locdao = new LocacaoDAO();
		LocacaoVO loc = new LocacaoVO();

		// loc.setIdLocacao(4L);
		// loc.setDataDaLocacao(Calendar.getInstance());
		// loc.setDataDaDevolucao();
		// loc.setCliente(cli);
		// loc.setProduto(disc);
		// loc.setValorLocacao(8);
		// loc.setMulta(0);
		// loc.setDesconto(1.5);
		// loc.setValorPago(6.5);
		// loc.setPago(true);

		// LocacaoVO loc5 = new LocacaoVO();

		// locdao.inserir(loc);

		// loc5.setIdLocacao(16L);
		// locdao.removerById(loc5);

	}
}