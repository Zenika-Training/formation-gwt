function g4(){}
function g6(a,b){a.o=b}
function f6(a,b){a.n=b}
function t6(a,b){a.a=b}
function u6(a,b){a.b=b}
function v6(a,b){a.c=b}
function w6(a,b){a.d=b}
function x6(a,b){a.e=b}
function SY(a,b){ll(a.Z,b)}
function QY(a,b){RY(a,b,b,-1)}
function lX(a){this.a=a}
function d4(a,b){this.a=a;this.b=b}
function ll(b,a){b.selectedIndex=a}
function QW(a,b){return a.rows[b].cells.length}
function NY(a,b){MY(a,b);return OY(a.Z.options[b])}
function bX(){ZW.call(this);VW(this,new lX(this));WW(this,new KX(this))}
function OY(a){var b;b=a.text;a.hasAttribute(qpb)&&b.length>1&&(b=R9(b,1,b.length-1));return b}
function a4(a,b){var c;for(c=0;c<a.c.Z.options.length;++c){if(K9(NY(a.c,c),b)){return c}}return 0}
function cX(a,b,c){var d=a.rows[b];for(var e=0;e<c;e++){var f=$doc.createElement(ylb);d.appendChild(f)}}
function c3(b,c,d){var e,f;e=new oS(b,'saveOperateur');try{f=nS(e,1);KR(f,JR(f,Vlb));LR(f,c);mS(e,d,(GS(),FS))}catch(a){a=CG(a);if(cv(a,57)){YO(rpb)}else throw a}}
function aX(a,b){var c,d,e;if(b<0){throw new I8('Cannot create a row with a negative index: '+b)}d=a.i.rows.length;for(c=d;c<=b;++c){c!=a.i.rows.length&&OW(a,c);e=$doc.createElement(zlb);mO(a.i,e,c)}}
function b4(a){var b,c,d,e,f,g;this.b=new _Z;this.b.Z[Uob]=!false;this.e=new _Z;this.a=new _Z;this.c=new TY;QY(this.c,'ADMINISTRATEUR');QY(this.c,'AGENT');this.d=new tU('Save changes');VZ(this.b,a.b);VZ(this.e,a.e);VZ(this.a,a.a);SY(this.c,a4(this,a.d));d=new bX;XW(d,0,0,'Login : ');XW(d,1,0,'Phone :');XW(d,2,0,'E-mail :');XW(d,3,0,'Role :');YW(d,0,1,this.b);YW(d,1,1,this.e);YW(d,2,1,this.a);YW(d,3,1,this.c);b=new ZX;qJ(b.Z,wmb,true);YX(b,this.d);e=new F_;E_(e,d);E_(e,b);f=new ZX;qJ(f.Z,xmb,true);YX(f,new fY);YX(f,e);c=new pX;g=new x5;LT(c,g,c.Z);LT(c,f,c.Z);RJ(this,c);xJ(this.d,new d4(this,a),(To(),To(),So))}
var rpb='Error while trying to save the operator';yH(461,462,mjb,bX);_.Ec=function dX(){return this.i.rows.length};_.Fc=function eX(a,b){var c,d;aX(this,a);if(b<0){throw new I8('Cannot create a column with a negative index: '+b)}c=(OW(this,a),QW(this.i,a));d=b+1-c;d>0&&cX(this.i,a,d)};yH(463,464,{},lX);yH(571,307,gjb,b4);_.a=null;_.b=null;_.c=null;_.d=null;_.e=null;yH(572,1,wjb,d4);_.zb=function e4(a){var b;b=new y6;f6(b,this.b.n);t6(b,$Z(this.a.a));u6(b,$Z(this.a.b));v6(b,this.b.c);w6(b,NY(this.a.c,this.a.c.Z.selectedIndex));x6(b,$Z(this.a.e));g6(b,this.b.o);c3((m4(),l4),b,new g4)};_.a=null;_.b=null;yH(573,1,{},g4);_.kb=function h4(a){YO(rpb)};_.rc=function i4(a){hv(a);YO('Operator saved')};yH(580,1,yjb);_.lb=function F4(){oX(this.a.b);nX(this.a.b,new b4(this.b));KO();!!JO&&TP(JO,ymb)};var vD=c8(hnb,'EcranOperateur',571),uD=c8(hnb,'EcranOperateur$1',572),tD=c8(hnb,'EcranOperateur$1$1',573),rB=c8(dnb,'FlexTable',461),qB=c8(dnb,'FlexTable$FlexCellFormatter',463);Mjb(ph)(2);