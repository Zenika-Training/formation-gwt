function s4(){}
function s6(a,b){a.o=b}
function r6(a,b){a.n=b}
function F6(a,b){a.a=b}
function G6(a,b){a.b=b}
function H6(a,b){a.c=b}
function I6(a,b){a.d=b}
function J6(a,b){a.e=b}
function cZ(a,b){tl(a.Z,b)}
function aZ(a,b){bZ(a,b,b,-1)}
function xX(a){this.a=a}
function p4(a,b){this.a=a;this.b=b}
function tl(b,a){b.selectedIndex=a}
function aX(a,b){return a.rows[b].cells.length}
function ZY(a,b){YY(a,b);return $Y(a.Z.options[b])}
function nX(){jX.call(this);fX(this,new xX(this));gX(this,new WX(this))}
function m4(a,b){var c;for(c=0;c<a.c.Z.options.length;++c){if(W9(ZY(a.c,c),b)){return c}}return 0}
function oX(a,b,c){var d=a.rows[b];for(var e=0;e<c;e++){var f=$doc.createElement(Flb);d.appendChild(f)}}
function $Y(a){var b,c;b=a.text;(c=a.getAttributeNode(Dpb),!!(c&&c.specified))&&b.length>1&&(b=bab(b,1,b.length-1));return b}
function o3(b,c,d){var e,f;e=new AS(b,'saveOperateur');try{f=zS(e,1);WR(f,VR(f,amb));XR(f,c);yS(e,d,(SS(),RS))}catch(a){a=KG(a);if(kv(a,57)){rP(Epb)}else throw a}}
function mX(a,b){var c,d,e;if(b<0){throw new U8('Cannot create a row with a negative index: '+b)}d=a.i.rows.length;for(c=d;c<=b;++c){c!=a.i.rows.length&&$W(a,c);e=Yk($doc,Glb);HO(a.i,e,c)}}
function n4(a){var b,c,d,e,f,g;this.b=new l$;this.b.Z[fpb]=!false;this.e=new l$;this.a=new l$;this.c=new dZ;aZ(this.c,'ADMINISTRATEUR');aZ(this.c,'AGENT');this.d=new FU('Save changes');f$(this.b,a.b);f$(this.e,a.e);f$(this.a,a.a);cZ(this.c,m4(this,a.d));d=new nX;hX(d,0,0,'Login : ');hX(d,1,0,'Phone :');hX(d,2,0,'E-mail :');hX(d,3,0,'Role :');iX(d,0,1,this.b);iX(d,1,1,this.e);iX(d,2,1,this.a);iX(d,3,1,this.c);b=new jY;xJ(b.Z,Emb,true);iY(b,this.d);e=new R_;Q_(e,d);Q_(e,b);f=new jY;xJ(f.Z,Fmb,true);iY(f,new rY);iY(f,e);c=new BX;g=new J5;XT(c,g,c.Z);XT(c,f,c.Z);YJ(this,c);EJ(this.d,new p4(this,a),(_o(),_o(),$o))}
var Epb='Error while trying to save the operator';GH(458,459,yjb,nX);_.Ec=function pX(){return this.i.rows.length};_.Fc=function qX(a,b){var c,d;mX(this,a);if(b<0){throw new U8('Cannot create a column with a negative index: '+b)}c=($W(this,a),aX(this.i,a));d=b+1-c;d>0&&oX(this.i,a,d)};GH(460,461,{},xX);GH(568,306,sjb,n4);_.a=null;_.b=null;_.c=null;_.d=null;_.e=null;GH(569,1,Ijb,p4);_.zb=function q4(a){var b;b=new K6;r6(b,this.b.n);F6(b,k$(this.a.a));G6(b,k$(this.a.b));H6(b,this.b.c);I6(b,ZY(this.a.c,this.a.c.Z.selectedIndex));J6(b,k$(this.a.e));s6(b,this.b.o);o3((y4(),x4),b,new s4)};_.a=null;_.b=null;GH(570,1,{},s4);_.kb=function t4(a){rP(Epb)};_.rc=function u4(a){pv(a);rP('Operator saved')};GH(577,1,Kjb);_.lb=function R4(){AX(this.a.b);zX(this.a.b,new n4(this.b));dP();!!cP&&dQ(cP,Gmb)};var DD=o8(pnb,'EcranOperateur',568),CD=o8(pnb,'EcranOperateur$1',569),BD=o8(pnb,'EcranOperateur$1$1',570),zB=o8(lnb,'FlexTable',458),yB=o8(lnb,'FlexTable$FlexCellFormatter',460);Yjb(ph)(2);