package ifnet;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
		ArrayList<Conteudo> tipoconteudos = new ArrayList<Conteudo>();
		
		Scanner leitura = new Scanner(System.in);
		Usuario novoUsuario, usuarioAtual = new Professor("Aluno", "prontuario", "senha", new Area("area"), new Disciplina("disciplina"));
		boolean comecar = true, contem, sair = true, voltar = true, entrou = false;
		int opcao = 0;			
	
		while(comecar) {
			
			do {
				System.out.println("Bem vindo ao IFNET");
				System.out.println("1.Entrar\n2.Criar nova conta\n3.Sair");
				opcao = Integer.parseInt(leitura.nextLine());
			
				switch(opcao) {
				
					case 1:
						/*
						usuarioAtual = Usuario.loginUsuario(usuarios);
						contem = usuarios.contains(usuarioAtual);
						*/
						sair = false;
						break;
					case 2:
						/*
						novoUsuario = usuarioAtual = Usuario.cadastrarUsuario();
						usuarios.add(novoUsuario);
						*/
						break;
					case 3:
						comecar = sair = false;
						break;
					default:
						System.out.println("Op��o inv�lida");
				}
			}while(sair);
			
			sair = true;
			
			if(entrou) {
				
				if(usuarioAtual.getClass() == Aluno.class){
					
					do {
						
						voltar = true;
						
						System.out.println(usuarioAtual.getNome());
						System.out.println("1.Conteudo\n2.Amizade\n3.Disciplina\n4.Curso"
								+ "\n5.Consultar Grupo de Pesquisa por Disciplina\n6.Sair");
						opcao = Integer.parseInt(leitura.nextLine());
					
						switch(opcao) {
						
							case 1:
								
								do {
									
									System.out.println("Conteudo");
									System.out.println("1.Postar Conteudo\n2.Escluir Conteudo\n3.Voltar");
									opcao = Integer.parseInt(leitura.nextLine());
									
									switch(opcao) {
										case 1:
											System.out.println("Conteudo postado");
											break;
										case 2:
										System.out.println("****Conteudo excluido com Sucesso****");
											break;
										case 3:
											voltar = false;
										default:
											System.out.println("Op��o inv�lida");
									}
								}while(voltar);
							
								break;
							case 2:
								
								do {
									
									System.out.println("Amizade");
									System.out.println("1.Enviar pedido de amizade\n2.Definir grau de confiabilidade"
											+ "\n3.Consultar usuario com mais relacionamentos\n4.Voltar");
									opcao = Integer.parseInt(leitura.nextLine());
									
									switch(opcao) {
										case 1:
											System.out.println("Pedido de amizade enviado");
											break;
										case 2:
											System.out.println("Grau de amizade definido");
											break;
										case 3:
											System.out.println("Consultado usuarios com mais relacionamentos");
											break;
										case 4:
											voltar = false;
											break;
										default:
											System.out.println("Op��o inv�lida");
									}
									
								}while(voltar);
								
								break;
							case 3:
								
								do {
									
									System.out.println("Disciplina");
									System.out.println("1.Cadastrar Disciplina\n2.Escluir Disciplina\n3.Voltar");
									opcao = Integer.parseInt(leitura.nextLine());
									
									switch(opcao) {
										case 1:
											System.out.println("Disciplina cadastrada");
											break;
										case 2:
											System.out.println("Disciplina excluida");
											break;
										case 3:
											voltar = false;
											break;
										default:
											System.out.println("Op��o inv�lida");
									}
									
								}while(voltar);
								
								break;
							case 4:
								
								do {
									
									System.out.println("Curso");
									System.out.println("1.Cadastrar Curso\n2.Escluir Curso\n3.Voltar");
									opcao = Integer.parseInt(leitura.nextLine());
									
									switch(opcao) {
										case 1:
											System.out.println("Curso cadastrado");
											break;
										case 2:
											System.out.println("Curso excluido");
											break;
										case 3:
											voltar = false;
											break;
										default:
											System.out.println("Op��o inv�lida");
									}
									
								}while(voltar);
								
								break;
							case 5:
								System.out.println("Consultado grupo de pesquisa por disciplina");
								break;
							case 6:
								sair = false;
								break;
							default:
								System.out.println("Op��o inv�lida");
						}
						
					}while(sair);
					
					sair = true;
					
				}else if(usuarioAtual.getClass() == Professor.class) {
					
					do {
						
						voltar = true;
					
						System.out.println(usuarioAtual.getNome());
						System.out.println("1.Conteudo\n2.Amizade\n3.Grupo\n4.Sair");
						opcao = Integer.parseInt(leitura.nextLine());
					
						switch(opcao) {
						
							case 1:
								
								do {
									
									System.out.println("Conteudo");
									System.out.println("1.Postar Conteudo\n2.Escluir Conteudo\n3.Voltar");
									opcao = Integer.parseInt(leitura.nextLine());
									
									switch(opcao) {
										case 1:
											System.out.println("Postar conteudo");
											break;
										case 2:
											System.out.println("Excluir conteudo");
											break;
										case 3:
											voltar = false;
											break;
										default:
											System.out.println("Op��o inv�lida");
									}
									
								}while(voltar);
								
								break;
							case 2:
								
								do {
									
									System.out.println("Amizade");
									System.out.println("1.Enviar pedido de amizade\n2.Definir grau de confiabilidade"
											+ "\n3.Consultar usuario com mais relacionamentos\n4.Voltar");
									opcao = Integer.parseInt(leitura.nextLine());
									
									switch(opcao) {
										case 1:
											System.out.println("Pedido de amizade enviado");
											break;
										case 2:
											System.out.println("Grau de confiabilidade definido");
											break;
										case 3:
											System.out.println("Usuario com mais realacionamentos consultado");
											break;
										case 4:
											voltar = false;
											break;
										default:
											System.out.println("Op��o inv�lida");
									}	
									
								}while(voltar);
								
								break;
							case 3:
								
								do {
									
									System.out.println("Grupo");
									System.out.println("1.Criar Grupo\n2.Escluir Grupo\n3.Consultar Grupos com Mais Usuarios\n"
											+ "4.Consultar Grupo de Pesquisa por Disciplina\n5.Voltar");
									opcao = Integer.parseInt(leitura.nextLine());
									
									switch(opcao) {
										case 1:
											System.out.println("Grupo criado");
											break;
										case 2:
											System.out.println("Grupo excluido");
											break;
										case 3:
											System.out.println("Grupo com mais usuarios consultado");
											break;
										case 4:
											System.out.println("Consultado grupo de pesquisa por disciplina");
											break;
										case 5:
											voltar = false;
											 break;
										default:
											System.out.println("Op��o inv�lida");
									}	
									
								}while(voltar);
								
								break;
							case 4:
								sair = false;
								//VOLTAR AO MENU ANTERIOR
								break;
							default:
								System.out.println("Op��o inv�lida");
						}
					}while(sair);		
				}	
			}
		}
	}
}
