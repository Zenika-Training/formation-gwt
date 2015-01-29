function e5(){}
function e7(a,b){a.p=b}
function d7(a,b){a.o=b}
function r7(a,b){a.b=b}
function s7(a,b){a.c=b}
function t7(a,b){a.d=b}
function u7(a,b){a.e=b}
function v7(a,b){a.f=b}
function DZ(a,b){Xl(a.$,b)}
function BZ(a,b){CZ(a,b,b,-1)}
function WX(a){this.b=a}
function b5(a,b){this.b=a;this.c=b}
function Xl(b,a){b.selectedIndex=a}
function zX(a,b){return a.rows[b].cells.length}
function yZ(a,b){xZ(a,b);return zZ(a.$.options[b])}
function MX(){IX.call(this);EX(this,new WX(this));FX(this,new vY(this))}
function zZ(a){var b;b=a.text;a.hasAttribute(Dqb)&&b.length>1&&(b=Sab(b,1,b.length-1));return b}
function $4(a,b){var c;for(c=0;c<a.d.$.options.length;++c){if(Iab(yZ(a.d,c),b)){return c}}return 0}
function NX(a,b,c){var d=a.rows[b];for(var e=0;e<c;e++){var f=$doc.createElement(Imb);d.appendChild(f)}}
function a4(b,c,d){var e,f;e=new WS(b,'saveOperateur');try{f=VS(e,1);qS(f,pS(f,enb));rS(f,c);US(e,d,(mT(),lT))}catch(a){a=tH(a);if(Nv(a,57)){JP(Eqb)}else throw a}}
function LX(a,b){var c,d,e;if(b<0){throw new G9('Cannot create a row with a negative index: '+b)}d=a.j.rows.length;for(c=d;c<=b;++c){c!=a.j.rows.length&&xX(a,c);e=$doc.createElement(Jmb);YO(a.j,e,c)}}
function _4(a){var b,c,d,e,f,g;this.c=new N$;this.c.$[fqb]=!false;this.f=new N$;this.b=new N$;this.d=new EZ;BZ(this.d,'ADMINISTRATEUR');BZ(this.d,'AGENT');this.e=new cV('Save changes');H$(this.c,a.c);H$(this.f,a.f);H$(this.b,a.b);DZ(this.d,$4(this,a.e));d=new MX;GX(d,0,0,'Login : ');GX(d,1,0,'Phone :');GX(d,2,0,'E-mail :');GX(d,3,0,'Role :');HX(d,0,1,this.c);HX(d,1,1,this.f);HX(d,2,1,this.b);HX(d,3,1,this.d);b=new KY;cK(b.$,Hnb,true);JY(b,this.e);e=new r0;q0(e,d);q0(e,b);f=new KY;cK(f.$,Inb,true);JY(f,new SY);JY(f,e);c=new $X;g=new v6;rU(c,g,c.$);rU(c,f,c.$);DK(this,c);jK(this.e,new b5(this,a),(Dp(),Dp(),Cp))}
var Eqb='Error while trying to save the operator';pI(458,459,rkb,MX);_.Mc=function OX(){return this.j.rows.length};_.Nc=function PX(a,b){var c,d;LX(this,a);if(b<0){throw new G9('Cannot create a column with a negative index: '+b)}c=(xX(this,a),zX(this.j,a));d=b+1-c;d>0&&NX(this.j,a,d)};pI(460,461,{},WX);pI(570,308,lkb,_4);_.b=null;_.c=null;_.d=null;_.e=null;_.f=null;pI(571,1,Bkb,b5);_.Hb=function c5(a){var b;b=new w7;d7(b,this.c.o);r7(b,M$(this.b.b));s7(b,M$(this.b.c));t7(b,this.c.d);u7(b,yZ(this.b.d,this.b.d.$.selectedIndex));v7(b,M$(this.b.f));e7(b,this.c.p);a4((k5(),j5),b,new e5)};_.b=null;_.c=null;pI(572,1,{},e5);_.pb=function f5(a){JP(Eqb)};_.zc=function g5(a){Sv(a);JP('Operator saved')};pI(579,1,Dkb);_.qb=function D5(){ZX(this.b.c);YX(this.b.c,new _4(this.c));vP();!!uP&&BQ(uP,Jnb)};var mE=a9(sob,'EcranOperateur',570),lE=a9(sob,'EcranOperateur$1',571),kE=a9(sob,'EcranOperateur$1$1',572),fC=a9(oob,'FlexTable',458),eC=a9(oob,'FlexTable$FlexCellFormatter',460);Rkb(Dh)(2);