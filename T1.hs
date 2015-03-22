-- E1. Escreva uma função hasEqHeads :: [Int] -> [Int] -> Bool que verifica
-- se as 2 listas possuem o mesmo primeiro elemento. 

hasEqHeads :: [Int] -> [Int] -> Bool
hasEqHeads list1 list2 = if (head list1 == head list2) then True else False
 
-- E2) Escreva uma função recursiva add10, que adicione a constante 10
-- a cada elemento de uma lista, produzindo outra lista.

add10 :: [Int] -> [Int]
add10 [] = []
add10 list = (head list)+10 : add10(tail list)

-- E3) Escreva uma função recursiva addComma, que adicione uma vírgula no final
-- de cada string contida numa lista. Dica: (1) Strings são listas
-- de caracteres. (2) Para concatenar listas, use o operador ++.

addComma :: [String] -> [String]
addComma [] = []
addComma str = ((head str)++",") : addComma(tail str)

-- E4) map

add10Map :: [Int] -> [Int]
add10Map [] = []
add10Map list = map(+10) list

-- E5. map

addCommaMap :: [String] -> [String]
addCommaMap [] = []
addCommaMap s1 = map (++ ",") s1

-- E6. Crie uma função htmlListItems :: [String] -> [String], que
-- receba uma lista de strings e retorne outra lista contendo as strings
-- formatadas como itens de lista em HTML. Dica: use map e defina uma
-- função auxiliar a ser aplicada a cada elemento. Exemplo de uso da função:

htmlListItems :: [String] -> [String]
htmlListItems [] = []
htmlListItems x = map(proc)x

proc :: String -> String
proc [] = []
proc y = 	"<LI>" ++ y ++ "</LI>"

-- E7. Crie uma função recursiva charFound :: Char -> String -> Bool, que 
-- verifique se o caracter (primeiro argumento) está contido na string
-- (segundo argumento).

charFound :: Char -> String -> Bool
charFound k listCh
	| k == (head listCh) = True
	| listCh == [] = False
	| otherwise = charFound k(tail listCh)


-- E8. Reescreva a função anterior sem recursão, usando outras funções
-- pré-definidas já vistas em aula.

charFound1 :: Char -> String -> Bool
charFound1 c listCh
	|filter(== c)listCh == [] = False
	|otherwise = True


-- E9. Use a função de alta ordem 'zipWith' para produzir uma função que obtenha as diferenças,
-- par a par, dos elementos de duas listas. Por exemplo: para listas de entrada [1,2,3,4] e [2,2,1,1],
-- o resultado será [-1,0,2,3].

calcDiferenca :: [Int] -> [Int] -> [Int]
calcDiferenca l1 l2 = zipWith (-) l1 l2

-- Part. 2

-- E1. Dada uma lista de números, calcular 2*n+1 para cada número n contido na lista.
calcList :: [Int] -> [Int]
calcList lista = map(+1)(map(*2)lista)

-- E2. Dadas duas listas X e Y de números inteiros, calcular 4*x+2*y+1 para cada par
-- de números x e y pertencentes às listas. 

calcPol :: [Int] -> [Int] -> [Int]
calcPol  p1 p2
	|(p1 == []) = []
	|(p2 == []) = [] 
	|otherwise = map (1+) (zipWith (+) (map(*4)p1) (map(*2)p2))

-- E3. Dada uma lista de strings, produzir outra lista com strings de 10 caracteres,
-- usando o seguinte esquema: strings de entrada com mais de 10 caracteres são truncadas,
-- strings com até 10 caracteres são completadas com '.' até ficarem com 10 caracteres. Exemplo:

string10 :: [String] -> [String]
string10 lstr = if(head lstr < 10) then (head lstr ++ ".") else string10(tail lstr)


-- E4. Dada uma lista de idades, selecionar as que são maiores que 20 e, para cada uma,
-- calcular o ano de nascimento correspondente (aproximado, considerando o ano atual).

calculaNasc :: [Int] -> [Int]
calculaNasc [] = []
calculaNasc idade = map(2015-)(filter(>20)idade)
