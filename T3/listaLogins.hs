import Data.Char

main :: IO ()
main = do
    strcontent <- readFile "nomes.csv"
    let strlist = lines strcontent
    	user = userName (strlist)
        strnew = "@inf.ufsm.br":"str2":user
    writeFile "logins.csv" (unlines strnew)

-- aplicar essa função para uma lista de strings
userName :: [String] -> [String]
userName [] = []
userName uname = [map toLower ((head x) : (reverse (takeWhile (/= ' ') (reverse x)))) | x<- uname] 