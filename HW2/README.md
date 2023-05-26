# HW2: Design Pattern

目標是建立一個通用的排序工具，它可以處理任何物件的排序。  
這種通用性要求我們設計一種方法讓不同類型的物件可以定義自己的比較規則。  
為此，我們引入了 Comparable，其中包含一個 compare() 方法。任何需要排序的物件，例如我們的範例中的 Dog，都需要實現此接口並提供 compare() 方法。  
在 Dog 中，使用名字來比較兩個 Dog 物件。  
排序工具 mySort() 在 MyUtility 類中。這個方法的輸入是一個實現了 Comparable 的物件的陣列。  
mySort() 使用泡沫排序算法（ Bubble sort ）對陣列進行排序。在排序過程中，mySort() 使用每個物件提供的 compare() 方法來確定物件的順序。  

這種設計遵循開放封閉原則（Open Closed Principle），即對擴展開放，對修改封閉。  
這意味著我們可以輕易地增加新的可排序物件類型，而無需修改 mySort() 方法或 Comparable 接口。  
這增加了我們程式的靈活性和可重用性。  