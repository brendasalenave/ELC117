main :: IO ()
main = do
    strcontent <- readFile "logins.txt"
    let strlist = lines strcontent
        strnew = "str1":"str2":strlist
    writeFile "logins.csv" (unlines strnew)