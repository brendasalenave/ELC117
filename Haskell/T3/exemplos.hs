import Data.Char
import qualified Data.Map as Map  

{- As funções de alta ordem any e all são pré-definidas na biblioteca Prelude
 do Haskell (veja seção Special Folds). Estude e teste essas funções e apresente
 2 exemplos de uso de cada uma delas. -}

stringVerify :: String -> Char -> Bool
stringVerify str c = any(==c) str

listVerify :: [Int] -> Bool
listVerify list =  any (>13) (map (*2) list)

divVerify :: [Int] -> Bool
divVerify s = all (== (3 `mod` 12)) s

ageCompare :: [Int] -> Bool
ageCompare lis = all (<=2000) (map (2015-) lis)

{- Em Haskell, o símbolo '$' pode ser usado para escrever códigos ainda mais
 curtos. Descubra seu significado e apresente 2 exemplos de uso. -}

calc :: Int -> [Int] -> Int
calc n list = sum (filter (> n) (map (*2) list))

verifica :: Int -> [(Int, Int)] -> Bool
verifica n tupla = Map.member (n) $ Map.fromList tupla 


{- Haskell permite composição de funções, exatamente como em matemática. Descubra
 como fazer isso e apresente 2 exemplos de aplicação de funções compostas.-}

calc' :: [Integer] -> Integer
calc' list = sum (takeWhile (<10000) (filter odd (map (^2) list)))  

raiz :: Float -> Integer
raiz k = ceiling (sqrt k) 