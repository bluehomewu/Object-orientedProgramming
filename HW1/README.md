# HW1: Design Pattern

本設計案例為一飲料製作機，適用於咖啡、茶等多種飲料。利用物件導向（ OOP ）原則，提高效率與可讀性。  
我們將共同步驟「煮水」與「倒進杯子」放入基礎類別 BeverageMaker 中，讓特定飲料製作類別（如 CoffeeMaker、TeaMaker ）繼承，以避免程式碼重複。  

為應對各飲料特定製作過程（如咖啡的「磨咖啡」、「添加糖和牛奶」；茶的「浸泡茶葉」、「添加檸檬」），基礎類別定義抽象方法（如 brew()、addCondiments() ），子類別必須覆寫。  
整合各飲料特定製作步驟於 prepare() 方法。  
針對可省略步驟（如冷飲加冰、熱飲不需），基礎類別定義可覆寫方法（如 addIce() ），提供預設實作。子類別覆寫時可自訂。這樣的設計具彈性，方便後續擴充新飲料類別。  