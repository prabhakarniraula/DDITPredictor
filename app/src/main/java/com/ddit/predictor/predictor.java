package  com.ddit.predictor;

import android.content.Context;
import android.widget.Toast;

public class predictor {
    //check which option is selected form dropdown list
    double fin,m;
    int selection;
    int sess;
    boolean radio;//true for out of 100 false for out of 150!!!
    String ans="";
    int m1,m2,m3,mlab,mext,m4;
    Context context;
    public predictor(Context context,int sess,int selection,boolean radio,int m1,int m2,int m3,int m4,int mlab,int mext,boolean flag)
    {
        this.context=context;
        this.m1=m1;
        this.sess=sess;

        this.mext=mext;
        this.radio=radio;
        this.mlab=mlab;
        this.m2=m2;
        this.m3=m3;
        //this.m4=m4;
        this.radio=flag;
        this.selection=selection;

    }

    public String getAns() {
        return ans;
    }

    public void predict()
    {



       /* if(sess==1)//sess1 selected
        {
            // double m2=0;//get from textbox
            //double m3=0;//get from textbox
            //double mlab=0;//get from textbox
            //double mext=0;//get from textbox
            if(m2<0 || m2>36 || m3<0 || m3>36 || mext<0 || mext>60 || !(m2%1 == 0) || !(m3%1 == 0) || !(mext%1 == 0) )
            {
                Toast.makeText(context ,"Invalid Inputs",Toast.LENGTH_SHORT).show();
                //throw exception
            }

            if(radio==true/*out of 100 selected)
            {
                if (selection == 0)//10 ptr
                {

                    fin=Math.round((84.5-((m2)/3+(m3)/3+4+mext))*3);

                    if(fin>36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                          //return ans;
                    }

                    ans= String.valueOf(fin + "/36");
                    //return;
                }

                if (selection == 1)//9ptr
                {

                    fin=Math.round((74.5-((m2)/3+(m3)/3+4+mext))*3);
                    if(fin>36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                        //  return;
                    }

                    ans= String.valueOf(fin + "/36");
                    //return;

                }

                if (selection == 2)
                {
                    fin=Math.round((64.5-((m2)/3+(m3)/3+4+mext))*3);
                    if(fin>36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                        //   return;
                    }

                    ans= String.valueOf(fin + "/36");
                    // return;
                }

                if (selection == 3)
                {

                    fin=Math.round((54.5-((m2)/3+(m3)/3+4+mext))*3);
                    if(fin>36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                        //  return;
                    }

                    ans= String.valueOf(fin + "/36");
                    //return;
                }

                if (selection == 4)
                {
                    fin=Math.round((44.5-((m2)/3+(m3)/3+4+mext))*3);
                    if(fin>36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                        //  return;
                    }

                    ans= String.valueOf(fin + "/36");
                    //return;
                }

                if (selection == 5)
                {
                    fin=Math.round((39.5-((m2)/3+(m3)/3+4+mext))*3);
                    if(fin>36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                        //return;
                    }

                    ans= String.valueOf(fin + "/36");
                    //return;
                }
                if(selection>=6)
                {
                    ans="Fail (Pointer less than 5)";
                }
            }

            if (radio==false/*out of 150)
            {
                //      double mlab =0;//lab marks from textbox


                if(mlab<0 || mlab >50 || !(mlab%1==0))
                {
                    //throw exception
                }

                // m = Math.Round((m1 + m2 + m3) / 3.0 + 4.0  +m4);

                if (selection == -1)
                {
                    // throw (new InvalidMarksException());
                }


                if (selection == 0)
                {

                    fin=Math.round((126.75-((m2)/3+(m3)/3+4+mlab+mext))*3);
                    if(fin > 36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                    }

                    ans= String.valueOf(fin + "/36");

                }
                if (selection == 1)
                {
                    fin= Math.round((111.75-((m2)/3+(m3)/3+4+mlab+mext))*3);
                    if(fin > 36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                    }

                    ans= String.valueOf(fin + "/36");

                }

                if (selection == 2)
                {
                    fin= Math.round((96.75-((m2)/3+(m3)/3+4+mlab+mext))*3);
                    if(fin > 36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                    }

                    ans= String.valueOf(fin + "/36");

                }

                if (selection == 3)
                {
                    fin= Math.round((81.75-((m2)/3+(m3)/3+4+mlab+mext))*3);
                    if(fin > 36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                    }

                    ans= String.valueOf(fin + "/36");
                }

                if (selection == 4)
                {
                    fin= Math.round((66.75-((m2)/3+(m3)/3+4+mlab+mext))*3);
                    if(fin > 36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                    }

                    ans= String.valueOf(fin + "/36");
                }

                if (selection == 5)
                {
                    fin= Math.round((59.25-((m2)/3+(m3)/3+4+mlab+mext))*3);
                    if(fin > 36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                    }

                    ans= String.valueOf(fin + "/36");
                }

                if(selection>=6)
                {
                    ans="Fail (Pointer less than 5)";
                }

            }



        }

        else if(sess==2)
        {
            //double m1=0;//get from textbox
            //double m3=0;//get from textbox
            //        double mext=0;//get from textbox
            if(m1<0 || m1>36 || m3<0 || m3>36 || mext<0 || mext>60 || !(m1%1 == 0) || !(m3%1 == 0) || !(mext%1 == 0) )
            {
                Toast.makeText(context ,"Invalid Inputs",Toast.LENGTH_SHORT).show();
                //throw exception
            }

            if(radio==true)
            {
                if (selection == 0)//10 ptr
                {

                    fin=Math.round((84.5-((m1)/3+(m3)/3+4+mext))*3);
                    if(fin>36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                        //  return;
                    }

                    ans= String.valueOf(fin + "/36");
                    //return;
                }

                if (selection == 1)//9ptr
                {

                    fin=Math.round((74.5-((m1)/3+(m3)/3+4+mext))*3);
                    if(fin>36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                        //  return;
                    }

                    ans= String.valueOf(fin + "/36");
                    //return;

                }

                if (selection == 2)
                {
                    fin=Math.round((64.5-((m1)/3+(m3)/3+4+mext))*3);
                    if(fin>36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                        //   return;
                    }

                    ans= String.valueOf(fin + "/36");
                    // return;
                            /*fin = Math.Round(64.5 - m);
                    if (fin > 60)
                    {
                        ans.Text = fin.ToString() + "/60" + " (Oh!)";
                        return;
                    }
                    ans.Text = fin.ToString() + "/60";
                    return;

                }

                if (selection == 3)
                {

                    fin=Math.round((54.5-((m1)/3+(m3)/3+4+mext))*3);
                    if(fin>36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                        //  return;
                    }

                    ans= String.valueOf(fin + "/36");
                    //return;
                }

                if (selection == 4)
                {
                    fin=Math.round((44.5-((m1)/3+(m3)/3+4+mext))*3);
                    if(fin>36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                        //  return;
                    }

                    ans= String.valueOf(fin + "/36");
                    //return;
                }

                if (selection == 5)
                {
                    fin=Math.round((39.5-((m1)/3+(m3)/3+4+mext))*3);
                    if(fin>36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                        //return;
                    }

                    ans= String.valueOf(fin + "/36");
                    //return;
                }

                if(selection>=6)
                {
                    ans="Fail (Pointer less than 5)";
                }
            }

            if (radio==false)
            {
                //      double mlab =0;//lab marks from textbox


                if(mlab<0 || mlab >50 || !(mlab%1==0))
                {
                    Toast.makeText(context ,"Invalid Inputs",Toast.LENGTH_SHORT).show();

                    //throw exception
                }

                // m = Math.Round((m1 + m2 + m3) / 3.0 + 4.0  +m4);

                if (selection == -1)
                {
                    // throw (new InvalidMarksException());
                }


                if (selection == 0)
                {

                    fin=Math.round((126.75-((m1)/3+(m3)/3+4+mlab+mext))*3);
                    if(fin > 36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                    }

                    ans= String.valueOf(fin + "/36");

                }
                if (selection == 1)
                {
                    /*fin = Math.Round(111.75 - m);//9
                    if (fin > 60)
                    {
                        ans.Text = fin.ToString() + "/60" + " (Oh!)";
                        return;
                    }

                    ans.Text = fin.ToString() + "/60";
                    fin= Math.round((111.75-((m2)/3+(m3)/3+4+mlab+mext))*3);

                    return;
                    fin= Math.round((111.75-((m1)/3+(m3)/3+4+mlab+mext))*3);
                    if(fin > 36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                    }

                    ans= String.valueOf(fin + "/36");

                }

                if (selection == 2)
                {
                    fin= Math.round((96.75-((m1)/3+(m3)/3+4+mlab+mext))*3);
                    if(fin > 36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                    }

                    ans= String.valueOf(fin + "/36");

                }

                if (selection == 3)
                {
                    fin= Math.round((81.75-((m1)/3+(m3)/3+4+mlab+mext))*3);
                    if(fin > 36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                    }

                    ans= String.valueOf(fin + "/36");
                }

                if (selection == 4)
                {
                    fin= Math.round((66.75-((m1)/3+(m3)/3+4+mlab+mext))*3);
                    if(fin > 36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                    }

                    ans= String.valueOf(fin + "/36");
                }

                if (selection == 5)
                {
                    fin= Math.round((59.25-((m1)/3+(m3)/3+4+mlab+mext))*3);
                    if(fin > 36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                    }

                    ans= String.valueOf(fin + "/36");
                }
                if(selection>=6)
                {
                    ans="Fail (Pointer less than 5)";
                }

            }




        }        else if(sess==3)//sess3 selected
        {
            if(m2<0 || m2>36 || m1<0 || m1>36 || mext<0 || mext>60 || !(m2%1 == 0) || !(m1%1 == 0) || !(mext%1 == 0) )
            {
                Toast.makeText(context ,"Invalid Inputs",Toast.LENGTH_SHORT).show();
                //throw exception
            }

            if(radio==true)
            {
                if (selection == 0)//10 ptr
                {

                    fin=Math.round((84.5-((m2)/3+(m1)/3+4+mext))*3);
                    if(fin>36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                        //  return;
                    }

                    ans= String.valueOf(fin + "/36");
                    //return;
                }

                if (selection == 1)//9ptr
                {

                    fin=Math.round((74.5-((m2)/3+(m1)/3+4+mext))*3);
                    if(fin>36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                        //  return;
                    }

                    ans= String.valueOf(fin + "/36");
                    //return;

                }

                if (selection == 2)
                {
                    fin=Math.round((64.5-((m2)/3+(m1)/3+4+mext))*3);
                    if(fin>36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                        //   return;
                    }

                    ans= String.valueOf(fin + "/36");
                    // return;


                }

                if (selection == 3)
                {

                    fin=Math.round((54.5-((m2)/3+(m1)/3+4+mext))*3);
                    if(fin>36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                        //  return;
                    }

                    ans= String.valueOf(fin + "/36");
                    //return;
                }

                if (selection == 4)
                {
                    fin=Math.round((44.5-((m2)/3+(m1)/3+4+mext))*3);
                    if(fin>36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                        //  return;
                    }

                    ans= String.valueOf(fin + "/36");
                    //return;
                }

                if (selection == 5)
                {
                    fin=Math.round((39.5-((m2)/3+(m1)/3+4+mext))*3);
                    if(fin>36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                        //return;
                    }

                    ans= String.valueOf(fin + "/36");
                    //return;
                }

                if(selection>=6)
                {
                    ans="Fail (Pointer less than 5)";
                }
            }

            if (radio==false)
            {
                //      double mlab =0;//lab marks from textbox


                if(mlab<0 || mlab >50 || !(mlab%1==0))
                {
                    //throw exception
                }

                // m = Math.Round((m1 + m2 + m3) / 3.0 + 4.0  +m4);

                if (selection == -1)
                {
                    // throw (new InvalidMarksException());
                }


                if (selection == 0)//10pointer
                {

                    fin=Math.round((126.75-((m2)/3+(m1)/3+4+mlab+mext))*3);
                    if(fin > 36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                    }

                    ans= String.valueOf(fin + "/36");

                }
                if (selection == 1)//9 pointer
                {

                    fin= Math.round((111.75-((m2)/3+(m1)/3+4+mlab+mext))*3);
                    if(fin > 36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                    }

                    ans= String.valueOf(fin + "/36");

                }

                if (selection == 2)
                {
                    fin= Math.round((96.75-((m2)/3+(m1)/3+4+mlab+mext))*3);
                    if(fin > 36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                    }

                    ans= String.valueOf(fin + "/36");

                }

                if (selection == 3)
                {
                    fin= Math.round((81.75-((m2)/3+(m1)/3+4+mlab+mext))*3);
                    if(fin > 36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                    }

                    ans= String.valueOf(fin + "/36");
                }

                if (selection == 4)
                {
                    fin= Math.round((66.75-((m2)/3+(m1)/3+4+mlab+mext))*3);
                    if(fin > 36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                    }

                    ans= String.valueOf(fin + "/36");
                }

                if (selection == 5)
                {
                    fin= Math.round((59.25-((m2)/3+(m1)/3+4+mlab+mext))*3);
                    if(fin > 36)
                    {
                        ans=String.valueOf(fin+"/36" + "any message");
                    }

                    ans= String.valueOf(fin + "/36");
                }

                if(selection>=6)
                {
                    ans="Fail (Pointer less than 5)";
                }

            }



        }*/
        if(sess==0)//external selected
        {
            //double m1=0;//get from textbox
            //  double m2=0;//get from textbox
            //    double m3=0;//get from textbox


            if(m1<0 || m1>36 || m2<0 || m2>36 || m3<0 || m3>36 || !(m1%1==0) || !(m2%1==0) || !(m3%1==0))
            {
                Toast.makeText(context ,"Invalid Inputs",Toast.LENGTH_SHORT).show();
                 ans="";
                return;
                //throw (new InvalidMarksException());
            }

            if(radio==true)
            {
                m = Math.ceil(((m1 + m2 + m3) / 3.0) + 4.0)/*+m4*/;
                if (selection == 0)//10 ptr
                {

                    fin = Math.ceil(84.5 - m); //10
                    if(fin>=0) {

                        if (fin > 60) {
                            ans = String.valueOf(fin + "/60" + "\t(Oh!)");
                            return;
                        }
                        ans = String.valueOf(fin + "/60");
                    }
                        return;
                }

                if (selection == 1)//9ptr
                {
                    fin = Math.ceil(74.5 - m);
                    if(fin>=0) {

                        if (fin > 60) {
                            ans = String.valueOf(fin + "/60" + "\t(Oh!)");
                            return;
                        }
                        ans = String.valueOf(fin + "/60");
                    }                    return;

                }

                if (selection == 2)//8 ptr
                {
                    fin = Math.ceil(64.5 - m);
                    if(fin>=0) {

                        if (fin > 60) {
                            ans = String.valueOf(fin + "/60" + "\t(Oh!)");
                            return;
                        }
                        ans = String.valueOf(fin + "/60");
                    }
                    return;

                }

                if (selection == 3)
                {

                    fin = Math.ceil(54.5 - m);
                    if(fin>=0) {

                        if (fin > 60) {
                            ans = String.valueOf(fin + "/60" + "\t(Oh!)");
                            return;
                        }
                        ans = String.valueOf(fin + "/60");
                    }
                    return;
                }

                if (selection == 4)
                {
                    fin = Math.ceil(44.5 - m);
                    if(fin>=0) {

                        if (fin > 60) {
                            ans = String.valueOf(fin + "/60" + "\t(Oh!)");
                            return;
                        }
                        ans = String.valueOf(fin + "/60");
                    }
                    return;
                }

                if (selection == 5)
                {
                    fin = Math.ceil(39.5 - m);
                    if(fin>=0) {

                        if (fin > 60) {
                            ans = String.valueOf(fin + "/60" + "\t(Oh!)");
                            return;
                        }
                        ans = String.valueOf(fin + "/60");
                    }
                    return;
                }

                if(selection>=6)
                {
                    ans="Fail (Pointer less than 5)";
                }

            }

            if (radio==false/*out of 150*/)
            {
                //  double m4 =0;//lab marks from textbox


                if(mlab<0 || mlab >50 || !(mlab%1==0))
                {
                    ans="";
                    Toast.makeText(context ,"Invalid Inputs",Toast.LENGTH_SHORT).show();
                    return;
                    //throw exception
                }

                m = Math.ceil(((m1 + m2 + m3)/3.0) + 4.0  +mlab);

                if (selection == -1)
                {
                    ans="";
                    return;
                    // throw (new InvalidMarksException());
                }


                if (selection == 0)
                {
                    fin = Math.ceil(126.75 - m);//10
                    if(fin>=0) {

                        if (fin > 60) {
                            ans = String.valueOf(fin + "/60" + "\t(Oh!)");
                            return;
                        }

                        ans = String.valueOf(fin + "/60");
                    }
                    return;

                }
                if (selection == 1)
                {
                    fin = Math.ceil(111.75 - m);//9
                    if(fin>=0) {

                        if (fin > 60) {
                            ans = String.valueOf(fin + "/60" + "\t(Oh!)");
                            return;
                        }

                        ans = String.valueOf(fin + "/60");
                    }
                    return;


                }

                if (selection == 2)
                {
                    fin = Math.ceil(96.75 - m);//8
                    if(fin>=0) {

                        if (fin > 60) {
                            ans = String.valueOf(fin + "/60" + "\t(Oh!)");
                            return;
                        }

                        ans = String.valueOf(fin + "/60");
                    }
                    return;

                }

                if (selection == 3)//7
                {
                    fin = Math.ceil(81.75 - m);
                    if(fin>=0) {

                        if (fin > 60) {
                            ans = String.valueOf(fin + "/60" + "\t(Oh!)");
                            return;
                        }

                        ans = String.valueOf(fin + "/60");
                    }
                    return;
                }

                if (selection == 4)
                {
                    fin = Math.ceil(66.75 - m);//6
                    if(fin>=0) {

                        if (fin > 60) {
                            ans = String.valueOf(fin + "/60" + "\t(Oh!)");
                            return;
                        }

                        ans = String.valueOf(fin + "/60");
                    }
                    return;

                }

                if (selection == 5)
                {
                    fin = Math.ceil(59.25 - m);//5
                    if(fin>=0) {

                        if (fin > 60) {
                            ans = String.valueOf(fin + "/60" + "\t(Oh!)");
                            return;
                        }

                        ans = String.valueOf(fin + "/60");
                    }
                    return;
                }

                if(selection>=6)
                {
                    ans="Fail (Pointer less than 5)";
                }
            }



        }
        else if(sess==4)//practical selected
        {
            //double m1=0;//get from textbox
            //double m2=0;//get from textbox
            // double m3=0;//get from textbox
            //double mext=0;

            if(m1<0 || m1>36 || m2<0 || m2>36 || m3<0 || m3>36 || mext<0 || mext>60 || !(m1%1==0) || !(m2%1==0) || !(m3%1==0) || !(mext%1==0))
            {
                Toast.makeText(context ,"Invalid Inputs",Toast.LENGTH_SHORT).show();
                //throw (new InvalidMarksException());
            }
            if (radio==false/*out of 150*/)
            {
                // double m4 =0;//lab marks from textbox


                //if(m4<0 || m4 >50 || !(m4%1==0))
                //{
                //throw exception
                //}

                m = Math.round((mext+(m1+m2+m3)/3+4));

                if (selection == -1)
                {
                    // throw (new InvalidMarksException());
                }


                if (selection == 0)
                {
                    fin = Math.round(126.75 - m);//10
                    if (fin > 50)
                    {
                        ans= String.valueOf(fin+"/50" + "any message");
                        return;
                    }

                    ans= String.valueOf(fin + "/50");
                    return;

                }
                if (selection == 1)
                {
                    fin = Math.round(111.75 - m);//9
                    if (fin > 50)
                    {
                        ans=String.valueOf(fin+"/50" + "any message");
                        return;
                    }

                    ans= String.valueOf(fin + "/50");
                    return;


                }

                if (selection == 2)
                {
                    fin = Math.round(96.75 - m);//8
                    if (fin > 50)
                    {
                        ans=String.valueOf(fin+"/50" + "any message");
                        return;
                    }

                    ans= String.valueOf(fin + "/50");
                    return;

                }

                if (selection == 3)//7
                {
                    fin = Math.round(81.75 - m);
                    if (fin > 50)
                    {
                        ans=String.valueOf(fin+"/50" + "any message");
                        return;
                    }

                    ans= String.valueOf(fin + "/50");
                    return;
                }

                if (selection == 4)
                {
                    fin = Math.round(66.75 - m);//6
                    if (fin > 50)
                    {
                        ans=String.valueOf(fin+"/50" + "any message");
                        return;
                    }

                    ans= String.valueOf(fin + "/50");
                    return;

                }

                if (selection == 5)
                {
                    fin = Math.round(59.25 - m);//5
                    if (fin > 50)
                    {
                        ans=String.valueOf(fin+"/50" + "any message");
                        return;
                    }

                    ans= String.valueOf(fin + "/50");
                    return;
                }

                if(selection>=6)
                {
                    ans="Fail (Pointer less than 5)";
                }

            }
            else
            {
                ans="select total=150";
            }


        }

        else if(sess==5)//know my pointer selected
        {
            if(radio==true)//out of 100
            {
                m=(m1+m2+m3)/3+4+mext;
                if(m>84.5)
                {
                    ans="10 GPA";
                }
                else if(m<84.5 && m>74.5)
                {
                    ans="9 GPA";
                }
                else if(m<74.5 && m>64.5)
                {
                    ans="8 GPA";
                }
                else if(m<64.5 && m>54.5)
                {
                    ans="7 GPA";
                }
                else if(m<54.5 && m>44.5)
                {
                    ans="6 GPA";
                }
                else if(m<44.5 && m>39.5)
                {
                    ans="5 GPA";
                }
            }

            else if(radio==false)
            {
                m=(m1+m2+m3)/3+mlab+4+mext;
                if(m>126.75)
                {
                    ans="10 GPA";
                }
                else if(m<126.75 && m>111.75)
                {
                    ans="9 GPA";
                }
                else if(m<111.75 && m>96.75)
                {
                    ans="8 GPA";
                }
                else if(m<96.75 && m>81.75)
                {
                    ans="7 GPA";
                }
                else if(m<81.75 && m>66.75)
                {
                    ans="6 GPA";
                }
                else if(m<66.75 && m>59.25)
                {
                    ans="5 GPA";
                }
            }
        }


    }

}