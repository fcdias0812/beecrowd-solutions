# Beecrowd Solutions - Java
Repositório dedicado à resolução de desafios de lógica e algoritmos da plataforma Beecrowd, focado na aplicação de boas práticas e fundamentos da linguagem Java.

**Contexto de Negócio**\
Este projeto centraliza soluções para problemas computacionais diversos, simulando cenários reais como processamento de dados financeiros, cálculos geométricos e automação de fluxos de decisão.

**Decisões Técnicas (O "Pulo do Gato")**\
• **Padronização de Localidade:** Uso sistemático de Locale.setDefault(Locale.US) para garantir que a entrada e saída de dados de ponto flutuante sigam o padrão internacional, evitando exceções de InputMismatch.\
• **Gerenciamento de Recursos:** Implementação do Scanner para leitura de fluxos, com atenção ao consumo de buffer e fechamento do recurso quando aplicável.\
• **Formatação de Saída:** Utilização de System.out.printf e String.format para atender aos requisitos rigorosos de precisão decimal (ex: .2f) exigidos por juízes online.\
• **Otimização de Tipagem:** Escolha criteriosa entre float e double baseada na precisão necessária, e uso de long para evitar overflow em problemas de grande escala.

**Conceitos Praticados**\
• **Estruturas de Controle:** Condicionais encadeadas e laços de repetição (while, for).\
• **Manipulação de Strings:** Concatenação eficiente e formatação.\
• **Matemática Computacional:** Uso da classe java.lang.Math (pow, sqrt, abs).\
• **Entrada/Saída (I/O):** Manipulação de fluxos via System.in e System.out.

**Como Rodar**\
Para executar qualquer exercício individualmente via terminal:

1. **Compilar:**\
``javac NomeDoExercicio.java``

2. **Executar:**\
``java NomeDoExercicio``
