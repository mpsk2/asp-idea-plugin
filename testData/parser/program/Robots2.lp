halt(DX,DY,X-DX,Y-DY,t) :- pos(_,X,Y,t-1), dir(DX,DY), dim(X-DX), dim(Y-DY), not stop(-DX,-DY,X,Y).

goto(R,DX,DY,X,Y,t) :- pos(R,X,Y,t-1), dir(DX,DY).
goto(R,DX,DY,X+DX,Y+DY,t) :- goto(R,DX,DY,X,Y,t), dim(X+DX), dim(Y+DY), not stop(DX,DY,X,Y), not halt(DX,DY,X,Y,t).

pos(R,X,Y,t) :- move(R,DX,DY,t), goto(R,DX,DY,X,Y,t), not goto(R,DX,DY,X+DX,Y+DY,t).
pos(R,X,Y,t) :- pos(R,X,Y,t-1), not move(R,_,_,t).

:- move(R,DX,DY,t-1), not goon(t-1), not move(R,DX,DY,t).