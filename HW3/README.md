# HW3: Design Pattern

這份程式碼使用了 command 模式，這是一種行為型設計模式，它將一個請求封裝為一個獨立的物件，這樣可以讓你使用不同的請求對客戶進行參數化，並將操作列隊，記錄 log 等。  
在這個情境下，我們有一個遙控器（Remote）和各種不同的設備（Television, Soundbox, Light）。  
為了讓遙控器能夠控制這些設備，定義了一個介面 DeviceCommand，然後讓每種設備都有一個對應的 command 類別（例如 TelevisionCommand），這些 command 類別實現了 DeviceCommand 介面。  
這樣，遙控器就可以透過這個介面與各種設備進行互動，而不需要直接依賴於具體的設備類別。這不僅減少了遙控器和設備之間的耦合度，也讓我們能夠更方便地增加新的設備和 command ，而不需要修改遙控器的程式碼。  