import Data.Char

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
