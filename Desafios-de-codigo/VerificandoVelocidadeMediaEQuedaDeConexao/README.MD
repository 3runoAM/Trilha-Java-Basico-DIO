# Desafio de código - Verificando Velocidade Média e Queda de Conexão

## 1 / 2 - Velocidade Média de Conexão

### Descrição

Você foi contratado para desenvolver um sistema que calcule a velocidade média de conexão de internet de um cliente durante um período. O sistema deve ler os registros recebidos como entrada, processar os dados e calcular a velocidade média de conexão em megabits por segundo (Mbps) ao longo do turno.

### Entrada

A entrada é uma string contendo uma lista de valores representando a velocidade de conexão em megabits por segundo (Mbps), separados por vírgulas.

### Saída

A saída do programa deve ser a velocidade média de conexão em Mbps. O sistema deve somar todos os valores da lista de entrada, calcular a média dividindo o total pelo número de registros, e exibir o resultado.

### Exemplos

A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

<table>
    <thead>
        <tr>
            <td>Entrada</td>
            <td>Saída</td>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>130,134,132,130,130,136</td>
            <td>132 Mbps</td>
        </tr>
        <tr>
            <td>120,130,125,125,120,130</td>
            <td>125 Mbps</td>
        </tr>
        <tr>
            <td>110,100, 120,110, 115,105</td>
            <td>110 Mbps</td>
        </tr>
    </tbody>
</table>

## 2 / 2 - Verificação de Queda de Conexão

### Descrição
Implemente um programa que verifique se houve queda de conexão em um dia. A queda de conexão é definida como qualquer velocidade registrada igual a 0 Mbps. O sistema deve ler os registros de velocidade de conexão, processar os dados e determinar se ocorreu queda de conexão durante o dia.

### Entrada
A entrada deve receber uma lista de valores inteiros representando a velocidade de conexão em Mbps separados por vírgulas.

### Saída
Deverá retornar "Queda de Conexao" se houver pelo menos uma velocidade registrada igual a 0 Mbps, e "Sem Quedas" caso contrário.

### Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

<table>
    <thead>
        <tr>
            <td>Entrada</td>
            <td>Saída</td>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>130,50,0,90,130,136</td>
            <td>Queda de Conexao</td>
        </tr>
        <tr>
            <td>120,130,125,125,120,130</td>
            <td>Sem Quedas</td>
        </tr>
        <tr>
            <td>110,125,80,0,105,125</td>
            <td>Queda de Conexao</td>
        </tr>
    </tbody>
</table>