

    // 2단계

    // 2단계에서 이름이라는 멤버 변수가 추가가 될겁니다.

    // 1단계에서 만든 생성자에서 받는 앙금과 반죽을 통해서 이름을 만들어야합니다.

    // 생성자에서 이름을 따로 받는 것이 아니라 앙금과 반죽을 조합해서 멤버 변수에 넣어 줘야함
    // 앙금, 반죽, 가격, 이름

    // 붕어빵 이름을 만들어주는데

    // 붕어빵 이름은 앙금 + 반죽으로 지정하겠습니다.
    // ex) 밀가루로 만든 슈붕

    // ex) 쌀가루, 팥
    // 쌀가루로 만든 팥

    // 활용

    // 동현의 붕어빵 = new 붕어빵("쌀가루", "슈크림");
    // -> 이렇게 했을 때 "쌀가루로 만든 슈크림" 이런 이름을 갖도록 만들면 됩니다.

    package com.example.calculator.apple;

    public class FishBread {

        private String sediment;
        private String dough;

        private String name;

        public FishBread(String dough, String sediment, double price) {
            this.dough = dough;
            this.sediment = sediment;

            this.name = newName(dough, sediment);
        }
        private String newName(String dough, String sediment) {
            return dough + "로 만든 " + sediment;
        }
        public String getSediment() {
            return sediment;
        }
        public String getDough() {
            return dough;
        }

        public void setSediment(String sediment) {
            this.sediment = sediment;
            this.name = newName(this.dough, sediment);
        }
        public void setDough(String dough) {
            this.dough = dough;
            this.name = newName(dough, this.sediment);
        }
    }