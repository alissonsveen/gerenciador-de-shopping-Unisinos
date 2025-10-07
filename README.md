# Sistema de Gerenciamento de Shopping

Sistema Java para gerenciamento de lojas em shopping centers com diferentes tipos de estabelecimentos comerciais.

## 📋 Tecnologias Utilizadas

- **Java** - Linguagem de programação principal
- **Java Scanner** - Para entrada de dados do usuário
- **Java Collections** - Arrays para gerenciamento de estoque e lojas

## 🏗️ Padrões de Projeto Implementados

### Herança
- Classe base `Loja` com especializações:
  - `Alimentacao` - Lojas de alimentação com data de alvará
  - `Vestuario` - Lojas de vestuário com produtos importados
  - `Bijuteria` - Lojas de bijuteria com meta de vendas
  - `Cosmetico` - Lojas de cosméticos com taxa de comercialização
  - `Informatica` - Lojas de informática com seguro eletrônicos

### Encapsulamento
- Atributos privados com métodos getter/setter
- Validação de dados na classe `Data`
- Controle de acesso aos atributos das classes

### Composição
- `Loja` composta por `Endereco` e `Data`
- `Shopping` composto por array de `Loja`
- `Produto` com `Data` de validade

## 🚀 Configuração e Execução

### Pré-requisitos
- Java 8 ou superior
- Compilador Java (javac)
- Terminal/Command Prompt

### Setup do Projeto

1. **Clone ou baixe o projeto**
   ```bash
   # Navegue até o diretório do projeto
   cd projeto_java_unisinos
   ```

2. **Compile o projeto**
   ```bash
   javac *.java
   ```

3. **Execute o programa**
   ```bash
   java Principal
   ```

### Funcionalidades

- **Criação de Lojas**: Sistema interativo para criar diferentes tipos de lojas
- **Criação de Produtos**: Cadastro de produtos com data de validade
- **Verificação de Vencimento**: Sistema que verifica se produtos estão vencidos
- **Gerenciamento de Estoque**: Inserção e remoção de produtos
- **Cálculos Automáticos**: Gastos com salários e classificação de tamanho da loja

### Estrutura do Projeto

```
projeto_java_unisinos/
├── Principal.java          # Classe principal com menu interativo
├── Loja.java              # Classe base para lojas
├── Shopping.java          # Gerenciamento de shopping
├── Produto.java           # Modelo de produto
├── Data.java              # Utilitário para manipulação de datas
├── Endereco.java          # Modelo de endereço
├── Alimentacao.java       # Especialização de loja
├── Vestuario.java         # Especialização de loja
├── Bijuteria.java         # Especialização de loja
├── Cosmetico.java         # Especialização de loja
└── Informatica.java       # Especialização de loja
```

## 💡 Características Técnicas

- **Validação de Datas**: Sistema robusto com verificação de anos bissextos
- **Tratamento de Exceções**: Validação de entrada de dados numéricos
- **Polimorfismo**: Uso de `instanceof` para identificação de tipos de loja
- **Sobrescrita de Métodos**: Implementação personalizada de `toString()`

## 🎯 Como Usar

1. Execute o programa com `java Principal`
2. Escolha a opção "1" para criar uma loja
3. Escolha a opção "2" para criar um produto
4. O sistema automaticamente verificará se o produto está vencido
5. Escolha a opção "3" para sair

O sistema utiliza uma data de referência fixa (20/10/2023) para verificação de vencimento de produtos.
