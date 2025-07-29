public class Regras {

        public double largura;

        public double altura;

        public double diagonal;

        public double areaRetangulo() {
            return largura * altura;

        }

        public double perimetroRetangulo() {
            return (largura + altura) * 2;

        }

        public double diagonalRetangulo() {
            this.diagonal = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));

            return this.diagonal;
        }
    }