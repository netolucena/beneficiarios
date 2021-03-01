# beneficiarios

Microserviço responsável pelo cadastro dos Beneficiário (Clientes) da aposentadoria.

Utiliza o banco de dados embarcado H2.

Recebe as informações dos aportes de valores de aposentadoria por uma fila RabbitMQ (configurada por docker compose).

O microserviço está hospedado na Amazon EC2 conforme os endpoints descritos abaixo.

Endpoints:
Buscar todos os beneficiários(GET): ec2-3-134-107-142.us-east-2.compute.amazonaws.com:8080/beneficiarios

Adicionar Beneficiário (POST): ec2-3-134-107-142.us-east-2.compute.amazonaws.com:8080/beneficiarios
Exemplo de parâmetro body 
{
  "nome": "Neto Lucena",
  "cpf": "555.333.777-88",
  "email": "netolucena@test.com",
  "saldoAposentadoria": 213214.00,
  "qtdAnosRecebimentoAposentadoria": 10
 }

Buscar beneficiário por ID(GET): ec2-3-134-107-142.us-east-2.compute.amazonaws.com:8080/beneficiarios/:id
