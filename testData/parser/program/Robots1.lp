#program base.
dir(-1,0;1,0;0,-1;0,1).

stop( DX, DY,X,   Y   ) :- barrier(X,Y,DX,DY).
stop(-DX,-DY,X+DX,Y+DY) :- stop(DX,DY,X,Y).

#external target(R,X,Y) : available_target(R,M,X,Y).
#external pos(R,X,Y,0) : dim(X), dim(Y), robot(R).

#program trans(t).