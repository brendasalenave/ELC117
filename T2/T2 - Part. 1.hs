-- Escreva uma função geraPotencias :: Int -> [Int], que gere uma
-- lista com as potências de 2, com expoente de n até 0, onde n é
-- o argumento para a função. Use a sintaxe de list comprehension.
-- Exemplo de uso da função:

geraPotencias :: Int -> [Int]
geraPotencias  n = [2^x | x <- [n, n-1..0]]

--

addSuffix :: String -> [String] -> [String]
addSuffix str listStr = [x ++ str | x <- listStr]