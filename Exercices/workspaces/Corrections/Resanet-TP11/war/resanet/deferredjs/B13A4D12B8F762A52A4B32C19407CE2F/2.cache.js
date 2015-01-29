function O3(){}
function O5(a,b){a.p=b}
function N5(a,b){a.o=b}
function _5(a,b){a.b=b}
function a6(a,b){a.c=b}
function b6(a,b){a.d=b}
function c6(a,b){a.e=b}
function d6(a,b){a.f=b}
function zY(a,b){jl(a.$,b)}
function xY(a,b){yY(a,b,b,-1)}
function UW(a){this.b=a}
function L3(a,b){this.b=a;this.c=b}
function jl(b,a){b.selectedIndex=a}
function xW(a,b){return a.rows[b].cells.length}
function uY(a,b){tY(a,b);return vY(a.$.options[b])}
function KW(){GW.call(this);CW(this,new UW(this));DW(this,new rX(this))}
function vY(a){var b;b=a.text;a.hasAttribute(Vob)&&b.length>1&&(b=x9(b,1,b.length-1));return b}
function I3(a,b){var c;for(c=0;c<a.d.$.options.length;++c){if(q9(uY(a.d,c),b)){return c}}return 0}
function LW(a,b,c){var d=a.rows[b];for(var e=0;e<c;e++){var f=$doc.createElement(clb);d.appendChild(f)}}
function K2(b,c,d){var e,f;e=new XR(b,'saveOperateur');try{f=WR(e,1);rR(f,qR(f,ylb));sR(f,c);VR(e,d,(nS(),mS))}catch(a){a=wG(a);if(_u(a,57)){LO(Wob)}else throw a}}
function JW(a,b){var c,d,e;if(b<0){throw new o8('Cannot create a row with a negative index: '+b)}d=a.j.rows.length;for(c=d;c<=b;++c){c!=a.j.rows.length&&vW(a,c);e=$doc.createElement(dlb);$N(a.j,e,c)}}
function J3(a){var b,c,d,e,f,g;this.c=new IZ;this.c.$[xob]=!false;this.f=new IZ;this.b=new IZ;this.d=new AY;xY(this.d,'ADMINISTRATEUR');xY(this.d,'AGENT');this.e=new aU('Save changes');CZ(this.c,a.c);CZ(this.f,a.f);CZ(this.b,a.b);zY(this.d,I3(this,a.e));d=new KW;EW(d,0,0,'Login : ');EW(d,1,0,'Phone :');EW(d,2,0,'E-mail :');EW(d,3,0,'Role :');FW(d,0,1,this.c);FW(d,1,1,this.f);FW(d,2,1,this.b);FW(d,3,1,this.d);b=new GX;fJ(b.$,_lb,true);FX(b,this.e);e=new m_;l_(e,d);l_(e,b);f=new GX;fJ(f.$,amb,true);FX(f,new OX);FX(f,e);c=new YW;g=new d5;sT(c,g,c.$);sT(c,f,c.$);GJ(this,c);mJ(this.e,new L3(this,a),(Ro(),Ro(),Qo))}
var Wob='Error while trying to save the operator';sH(452,453,Uib,KW);_.Ec=function MW(){return this.j.rows.length};_.Fc=function NW(a,b){var c,d;JW(this,a);if(b<0){throw new o8('Cannot create a column with a negative index: '+b)}c=(vW(this,a),xW(this.j,a));d=b+1-c;d>0&&LW(this.j,a,d)};sH(454,455,{},UW);sH(561,303,Oib,J3);_.b=null;_.c=null;_.d=null;_.e=null;_.f=null;sH(562,1,cjb,L3);_.zb=function M3(a){var b;b=new e6;N5(b,this.c.o);_5(b,HZ(this.b.b));a6(b,HZ(this.b.c));b6(b,this.c.d);c6(b,uY(this.b.d,this.b.d.$.selectedIndex));d6(b,HZ(this.b.f));O5(b,this.c.p);K2((U3(),T3),b,new O3)};_.b=null;_.c=null;sH(563,1,{},O3);_.lb=function P3(a){LO(Wob)};_.rc=function Q3(a){ev(a);LO('Operator saved')};sH(570,1,ejb);_.mb=function l4(){XW(this.b.c);WW(this.b.c,new J3(this.c));xO();!!wO&&DP(wO,bmb)};var pD=K7(Mmb,'EcranOperateur',561),oD=K7(Mmb,'EcranOperateur$1',562),nD=K7(Mmb,'EcranOperateur$1$1',563),lB=K7(Imb,'FlexTable',452),kB=K7(Imb,'FlexTable$FlexCellFormatter',454);sjb(ph)(2);