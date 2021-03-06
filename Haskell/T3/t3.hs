import Data.Char

{- 1. Escreva uma função recursiva firstName :: String -> String que,
 dado o nome completo de uma pessoa, obtenha seu primeiro nome.
 Suponha que cada parte do nome seja separada por um espaço e que
 não existam espaços no início ou fim do nome.-}

firstName :: String -> String
firstName name
	|((head name) == ' ') = [] 
	|otherwise = (head name) : firstName(tail name)


{- 2. Escreva uma função firstName' :: String -> String com o mesmo
 resultado do exercício anterior, mas sem usar recursão.-}

firstName2 :: String -> String
firstName2 name1 = takeWhile (/= ' ') name1


{- 3.Escreva uma função lastName :: String -> String que, dado o nome
 completo de uma pessoa, obtenha seu último sobrenome. Suponha que
 cada parte do nome seja separada por um espaço e que não existam
 espaços no início ou fim do nome.-}

lastName :: String -> String
lastName lname = (reverse (takeWhile (/= ' ') (reverse lname)))


{- 4.Escreva uma função não-recursiva userName :: String -> String que,
 dado o nome completo de uma pessoa, crie um nome de usuário (login)
 da pessoa, formado por: primeira letra do nome seguida do sobrenome,
 tudo em minúsculas. Dica: estude as funções pré-definidas no módulo
 Data.Char, para manipulação de maiúsculas e minúsculas.-}

userName :: String -> String
userName uname = map toLower ((head uname) : (reverse (takeWhile (/= ' ') (reverse uname))))


{- 5.Escreva uma função não-recursiva encodeName :: String -> String que
 substitua vogais em uma string, conforme o esquema a seguir: a = 4,
 e = 3, i = 1, o = 0, u = 00. -}

encodeName :: String -> String
encodeName eName = concatMap busca eName
	where busca x
		| (x == 'a' || x =='A') = "4"
		| (x == 'e' || x =='E') = "3" 
		| (x == 'i' || x =='I') = "1" 
		| (x == 'o' || x =='O') = "0" 
		| (x == 'u' || x =='U') = "00"
		| otherwise = [x]


{- 6.Escreva uma função isElem :: Int -> [Int] -> Bool que verifique se
 um dado elemento pertence a uma lista, conforme os exemplos: -}

isElem :: Int -> [Int] -> Bool
isElem x [] = False
isElem x lista
	|x == (head lista) = True
	|otherwise = isElem x (tail lista)


{-7.Escreva uma função recursiva que retorne o número de vogais em uma string -}

countVowel :: String -> Int
countVowel [] =0
countVowel str  
		|((head str) == 'a') || ((head str) == 'A') = 1 + countVowel(tail str)
		|((head str) == 'e') || ((head str) == 'E') = 1 + countVowel(tail str)
		|((head str) == 'i') || ((head str) == 'I') = 1 + countVowel(tail str)
		|((head str) == 'o') || ((head str) == 'O') = 1 + countVowel(tail str)
		|((head str) == 'u') || ((head str) == 'U') = 1 + countVowel(tail str)
		|otherwise = 0 + countVowel(tail str) 


{-8.Escreva uma função não-recursiva que retorne o número de consoantes
 em uma string.                                                        -}

countCons :: String -> Int
countCons str = length ([x | x <- str, x /= 'a', x /= 'e', x /= 'i', x /= 'o', x /= 'u'])

{- 9.Escreva uma função não-recursiva isInt :: String -> Bool que verifique
 se uma dada string só contém dígitos (0 a 9).							-}

isInt :: String -> Bool
isInt [] = False
isInt str
	|length(str)== length(filter (\str->(str=='0')||(str=='1')||(str=='2')||(str=='3')||(str=='4')||(str=='5')||(str=='6')||(str=='7')||(str=='8')||(str=='9')) str) = True
	|otherwise = False


{- 10.Escreva uma função não-recursiva strToInt :: String -> Int que converta
 uma string em um número inteiro, fazendo operações aritméticas com seus dígitos
 (p.ex.: "356" = 3*100 + 5*10 + 6*1 = 356). Considere que a string seja um número
 válido, isto é, só contenha dígitos de 0 a 9. Dica: se não souber por onde
 começar, estude o exemplo de validação de CPF visto em aula.-}

strToInt :: String -> Int
strToInt [] = 0
strToInt str = sum(zipWith(*) newList mul)
--strToInt str = [(fromEnum d)*((fromEnum x)-48)|x<-s, d<-[(n/10) .. 1]]
	where
		s = (filter (\str->(str=='0')||(str=='1')||(str=='2')||(str=='3')||(str=='4')||(str=='5')||(str=='6')||(str=='7')||(str=='8')||(str=='9')) str)
		n = (length(s))
		newList = [((fromEnum x)-48)|x<-s]
		mul = criaLista(n)

criaLista:: Int -> [Int]
criaLista elem
	|(elem == -1) = []
	|otherwise = (10^elem) : criaLista (elem-1)
