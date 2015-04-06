import Data.Char

{- 1. Escreva uma fun��o recursiva firstName :: String -> String que,
 dado o nome completo de uma pessoa, obtenha seu primeiro nome.
 Suponha que cada parte do nome seja separada por um espa�o e que
 n�o existam espa�os no in�cio ou fim do nome.-}

firstName :: String -> String
firstName name
	|((head name) == ' ') = [] 
	|otherwise = (head name) : firstName(tail name)


{- 2. Escreva uma fun��o firstName' :: String -> String com o mesmo
 resultado do exerc�cio anterior, mas sem usar recurs�o.-}

firstName2 :: String -> String
firstName2 name1 = takeWhile (/= ' ') name1


{- 3.Escreva uma fun��o lastName :: String -> String que, dado o nome
 completo de uma pessoa, obtenha seu �ltimo sobrenome. Suponha que
 cada parte do nome seja separada por um espa�o e que n�o existam
 espa�os no in�cio ou fim do nome.-}

lastName :: String -> String
lastName lname = (reverse (takeWhile (/= ' ') (reverse lname)))


{- 4.Escreva uma fun��o n�o-recursiva userName :: String -> String que,
 dado o nome completo de uma pessoa, crie um nome de usu�rio (login)
 da pessoa, formado por: primeira letra do nome seguida do sobrenome,
 tudo em min�sculas. Dica: estude as fun��es pr�-definidas no m�dulo
 Data.Char, para manipula��o de mai�sculas e min�sculas.-}

userName :: String -> String
userName uname = map toLower ((head uname) : (reverse (takeWhile (/= ' ') (reverse uname))))


--ARRUMAR
{- 5.Escreva uma fun��o n�o-recursiva encodeName :: String -> String que
 substitua vogais em uma string, conforme o esquema a seguir: a = 4,
 e = 3, i = 1, o = 0, u = 00. -}

encodeName :: String -> String
encodeName eName =  [(if x == 'a' || x =='A' then '4' else
					if x == 'e' || x =='E' then '3' else
					if x == 'i' || x =='I' then '1' else
					if x == 'o' || x == 'O' then '0' else
					if x == 'u' || x == 'U' then '?' else x) | x <- eName]


{-Escreva uma fun��o isElem :: Int -> [Int] -> Bool que verifique se
 um dado elemento pertence a uma lista, conforme os exemplos: -}

isElem :: Int -> [Int] -> Bool
isElem x [] = False
isElem x lista
	|x == (head lista) = True
	|otherwise = isElem x (tail lista)
