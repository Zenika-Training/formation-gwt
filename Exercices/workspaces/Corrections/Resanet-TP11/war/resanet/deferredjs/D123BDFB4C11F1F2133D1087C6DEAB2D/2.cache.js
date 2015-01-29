function G4(){}
function G6(a,b){a.p=b}
function F6(a,b){a.o=b}
function T6(a,b){a.b=b}
function U6(a,b){a.c=b}
function V6(a,b){a.d=b}
function W6(a,b){a.e=b}
function X6(a,b){a.f=b}
function gZ(a,b){Fl(a.$,b)}
function eZ(a,b){fZ(a,b,b,-1)}
function BX(a){this.b=a}
function D4(a,b){this.b=a;this.c=b}
function Fl(b,a){b.selectedIndex=a}
function eX(a,b){return a.rows[b].cells.length}
function bZ(a,b){aZ(a,b);return cZ(a.$.options[b])}
function rX(){nX.call(this);jX(this,new BX(this));kX(this,new $X(this))}
function cZ(a){var b;b=a.text;a.hasAttribute(Wpb)&&b.length>1&&(b=pab(b,1,b.length-1));return b}
function A4(a,b){var c;for(c=0;c<a.d.$.options.length;++c){if(iab(bZ(a.d,c),b)){return c}}return 0}
function sX(a,b,c){var d=a.rows[b];for(var e=0;e<c;e++){var f=$doc.createElement(amb);d.appendChild(f)}}
function C3(b,c,d){var e,f;e=new DS(b,'saveOperateur');try{f=CS(e,1);ZR(f,YR(f,ymb));$R(f,c);BS(e,d,(VS(),US))}catch(a){a=XG(a);if(vv(a,57)){mP(Xpb)}else throw a}}
function qX(a,b){var c,d,e;if(b<0){throw new g9('Cannot create a row with a negative index: '+b)}d=a.j.rows.length;for(c=d;c<=b;++c){c!=a.j.rows.length&&cX(a,c);e=$doc.createElement(bmb);CO(a.j,e,c)}}
function B4(a){var b,c,d,e,f,g;this.c=new p$;this.c.$[ypb]=!false;this.f=new p$;this.b=new p$;this.d=new hZ;eZ(this.d,'ADMINISTRATEUR');eZ(this.d,'AGENT');this.e=new IU('Save changes');j$(this.c,a.c);j$(this.f,a.f);j$(this.b,a.b);gZ(this.d,A4(this,a.e));d=new rX;lX(d,0,0,'Login : ');lX(d,1,0,'Phone :');lX(d,2,0,'E-mail :');lX(d,3,0,'Role :');mX(d,0,1,this.c);mX(d,1,1,this.f);mX(d,2,1,this.b);mX(d,3,1,this.d);b=new nY;GJ(b.$,_mb,true);mY(b,this.e);e=new V_;U_(e,d);U_(e,b);f=new nY;GJ(f.$,anb,true);mY(f,new vY);mY(f,e);c=new FX;g=new X5;$T(c,g,c.$);$T(c,f,c.$);fK(this,c);NJ(this.e,new D4(this,a),(lp(),lp(),kp))}
var Xpb='Error while trying to save the operator';TH(455,456,Njb,rX);_.Ic=function tX(){return this.j.rows.length};_.Jc=function uX(a,b){var c,d;qX(this,a);if(b<0){throw new g9('Cannot create a column with a negative index: '+b)}c=(cX(this,a),eX(this.j,a));d=b+1-c;d>0&&sX(this.j,a,d)};TH(457,458,{},BX);TH(567,304,Hjb,B4);_.b=null;_.c=null;_.d=null;_.e=null;_.f=null;TH(568,1,Xjb,D4);_.Db=function E4(a){var b;b=new Y6;F6(b,this.c.o);T6(b,o$(this.b.b));U6(b,o$(this.b.c));V6(b,this.c.d);W6(b,bZ(this.b.d,this.b.d.$.selectedIndex));X6(b,o$(this.b.f));G6(b,this.c.p);C3((M4(),L4),b,new G4)};_.b=null;_.c=null;TH(569,1,{},G4);_.pb=function H4(a){mP(Xpb)};_.vc=function I4(a){Av(a);mP('Operator saved')};TH(576,1,Zjb);_.qb=function d5(){EX(this.b.c);DX(this.b.c,new B4(this.c));$O();!!ZO&&gQ(ZO,bnb)};var QD=C8(Mnb,'EcranOperateur',567),PD=C8(Mnb,'EcranOperateur$1',568),OD=C8(Mnb,'EcranOperateur$1$1',569),LB=C8(Inb,'FlexTable',455),KB=C8(Inb,'FlexTable$FlexCellFormatter',457);lkb(Ah)(2);