import Data.Char

main :: IO ()
main = do
    strcontent <- readFile "nomes.csv"
    let strlist = lines strcontent
    	user = userName (strlist)
        strnew = [x++"@inf.ufsm.br" | x<-user]
    writeFile "logins.csv" (unlines strnew)

userName :: [String] -> [String]
userName [] = []
userName uname = [map toLower ((head x) : (reverse (takeWhile (/= ' ') (reverse x)))) | x<- uname] 