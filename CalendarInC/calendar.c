#include <stdio.h>
#include <stdlib.h>

int prvidanuSe(int godina){

  int dan1;
  dan1 = (((godina - 1) * 365) + ((godina - 1) / 4) - ((godina - 1) / 100) + ((godina) / 400) + 1) % 7;
  return dan1;
}
int main()
{
    system("COLOR 6");
   int godina, mjesec, dan, daniuMjesecu, brojacDanauSe=0, prvidanuMj;
   printf("Unesi zeljenu godinu: ");
   scanf("%d",&godina);

   char *mjeseci[]={"Januar","Februar","Mart","April","Maj","Juni","Juli","August","Septembar","Oktobar","Novembar","Decembar"};

   int brojDanauMJ[]={31,28,31,30,31,30,31,31,30,31,30,31};

   if((godina % 4 == 0 && godina % 100 != 0) || godina % 400 == 0) //ovo je zbog toga jer je prestupna godina
   {
       brojDanauMJ[1]=29;
   }


   prvidanuMj=prvidanuSe(godina) - 1;

   for(mjesec=0;mjesec<12;mjesec++)
    {

      daniuMjesecu=brojDanauMJ[mjesec];
      printf("\n\n  > > > > > > > %s < < < < < < <",mjeseci[mjesec]);
      printf("\n  PON  UTO  SRI  CET  PET  SUB  NED\n");

      for(brojacDanauSe=0;brojacDanauSe<prvidanuMj;brojacDanauSe++)
      {
          printf("     ");//ovo je za prazna mjesta u mjesecu, ako nema tog dana na pocetku ili na kraju mjeseca
      }
      for(dan=1;dan<=daniuMjesecu;dan++)
      {
        printf("%5d",dan);

        if(++brojacDanauSe>6)
        {
            printf("\n");
            brojacDanauSe=0;
        }
        prvidanuMj=brojacDanauSe;
      }
   }
}
