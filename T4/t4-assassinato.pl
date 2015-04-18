vitima(anita).

insano(maria).
insano(adriano).

pobre(bernardo).
pobre(bia).
pobre(pedro).
pobre(maria).

rico(caren).
rico(alice).
rico(henrique).
rico(adriano).

relacionamento(anita,pedro).
relacionamento(anita,bernardo).
relacionamento(caren,bernardo).
relacionamento(caren,adriano).
relacionamento(maria,adriano).
relacionamento(maria,henrique).
relacionamento(alice,henrique).
relacionamento(alice,pedro).

segundafeira(pedro,santa_maria).
segundafeira(caren,porto_alegre).
segundafeira(henrique,apartamento).
segundafeira(bia,apartamento).
segundafeira(adriano,apartamento).
segundafeira(alice,apartamento).
segundafeira(bernardo,santa_maria).
segundafeira(maria,apartamento).

tercafeira(pedro,santa_maria).
tercafeira(caren,porto_alegre).
tercafeira(henrique,porto_alegre).
tercafeira(bia,porto_alegre).
tercafeira(adriano,apartamento).
tercafeira(alice,porto_alegre).
tercafeira(bernardo,santa_maria).
tercafeira(maria,santa_maria).

quartafeira(pedro,porto_alegre).
quartafeira(caren,porto_alegre).
quartafeira(henrique,apartamento).
quartafeira(bia,porto_alegre).
quartafeira(adriano,santa_maria).
quartafeira(alice,porto_alegre).
quartafeira(bernardo,porto_alegre).
quartafeira(maria,santa_maria).

quintafeira(pedro,santa_maria).
quintafeira(caren,santa_maria).
quintafeira(henrique,apartamento).
quintafeira(bia,santa_maria).
quintafeira(adriano,apartamento).
quintafeira(alice,apartamento).
quintafeira(bernardo,santa_maria).
quintafeira(maria,santa_maria).

sextafeira(pedro,apartamento).
sextafeira(caren,apartamento).
sextafeira(henrique,apartamento).
sextafeira(bia,apartamento).
sextafeira(adriano,apartamento).
sextafeira(alice,apartamento).
sextafeira(bernardo,apartamento).
sextafeira(maria,apartamento).

namorou(A,B):- relacionamento(A,B).
namorou(A,B):- relacionamento(B,A).
ciumes(X,Y):- namorou(Z,X), namorou(Y,Z).

bastao(X):- quintafeira(X, porto_alegre); quartafeira(X, santa_maria).
martelo(X):- quartafeira(X, apartamento); quintafeira(X, apartamento).
chave(X):- quartafeira(X, santa_maria); tercafeira(X, porto_alegre).

acesso(X):- (bastao(X); martelo(X)), chave(X), (quintafeira(X,apartamento); sextafeira(X, apartamento)).

motivo(X):- vitima(V), (insano(X); ciumes(X,V); pobre(X)).

assassino(X) :- motivo(X), acesso(X).

