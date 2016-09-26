# DoIntersect
Given two lines on a Cartesian plane, determine whether the two lines would intersect

y=kx+b

if (k1!=k2) they will intersect abs(k1-k2)>epsilton

if(they are same lines) they will intersect k1==k2 && b1==b2; abs(b1-b2)<epsilon

abs(k1-k2)>epsilton || abs(b1-b2)<epsilon, return true;
