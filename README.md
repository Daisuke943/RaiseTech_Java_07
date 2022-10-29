# 第10回課題提出　CRUD処理を実装
## DBのテーブル情報

### namesテーブル
| id  | name | 
| --- | ---- | 
| 1   | 酒井 | 
| 2   | 佐藤 | 
| 3   | 田中 | 
| 4   | 山本 | 
| 5   | 井上 | 

### moviesテーブル
| id  | name                   | director           | published_year | 
| --- | ---------------------- | ------------------ | -------------- | 
| 1   | ショーシャンクの空に   | フランク・ダラボン | 1900           | 
| 2   | この世界の片隅に       | 片渕須直           | 2000           | 
| 3   | 彼岸島                 | キム・テギュン     | 2010           | 
| 4   | 愛は波の彼方に         | ハーマン・ヤウ     | 2000           | 
| 5   | 人面魚　THE DEVIL FISH | デビッド・ジュアン | 2020           | 

## Read処理
~~~
GETメソッド : localhost:8080/names
namesテーブルにある名前をレスポンスとして返す
~~~
<img width="1184" alt="image" src="https://user-images.githubusercontent.com/47516167/198836200-aae1f707-fe0b-47a3-a5e0-918accf88bfb.png">

~~~
GETメソッド : localhost:8080/movies?published_year=2000
moviesテーブルに登録されている映画から2000年に公開された映画をレスポンスとして返す
~~~
<img width="1185" alt="image" src="https://user-images.githubusercontent.com/47516167/198835974-79e58faf-b5c4-4144-9d50-e1ad65d053a5.png">

## Create処理
~~~
POSTメソッド : http://localhost:8080/names
Body
{
 "name": "中村"
}
namesテーブルに新規で中村を登録
~~~
<img width="1187" alt="image" src="https://user-images.githubusercontent.com/47516167/198835878-bb9242fe-4f05-475f-87c9-782dcd6ef68c.png">

テーブルに中村が登録されていることを確認<br>
<img width="256" alt="image" src="https://user-images.githubusercontent.com/47516167/198836030-89a2603d-3544-48b5-95ae-febe9f788828.png">

## Update処理
~~~
PATCHメソッド : http://localhost:8080/names/6
Body
{
 "name": "小林"
}
Create処理で登録した中村を小林に更新
~~~

<img width="1187" alt="image" src="https://user-images.githubusercontent.com/47516167/198837024-89f4fb03-a3f9-4319-991a-a1271b6372d0.png">

中村が小林に更新されていることを確認<br>
<img width="259" alt="image" src="https://user-images.githubusercontent.com/47516167/198837079-8bd43649-c407-45f8-954f-66206cff98b5.png">

## Delete処理
~~~
DELETEメソッド : http://localhost:8080/names/6
Update処理で更新した小林を削除
~~~
<img width="1185" alt="image" src="https://user-images.githubusercontent.com/47516167/198837263-7ea160f0-7748-4b59-9dd4-59269bab70dd.png">

小林が削除されていることを確認<br>
<img width="260" alt="image" src="https://user-images.githubusercontent.com/47516167/198837320-ae93b107-b0e6-4bcd-9cc5-06ca2e6e2c08.png">
