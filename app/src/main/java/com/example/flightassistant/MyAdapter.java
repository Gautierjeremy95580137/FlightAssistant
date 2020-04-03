package com.example.flightassistant;



import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

import static androidx.core.content.ContextCompat.startActivity;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {



    private final List<Pair<String, String>> characters = Arrays.asList(
            Pair.create("LFBA", "AGEN LA GARENNE"),
            Pair.create("LFMA", "AIX LES MILLES"),
            Pair.create("LFKJ", "AJACCIO NAPOLEON BONAPARTE"),
            Pair.create("LFAQ", "ALBERT BRAY"),
            Pair.create("LFCI", "ALBI LE SEQUESTRE"),
            Pair.create("LFAY", "AMIENS-GLISY"),
            Pair.create("LFJR", "ANGERS MARCE"),
            Pair.create("LFBU", "ANGOULEME BRIE CHAMPNIERS"),
            Pair.create("LFLP", "ANNECY MEYTHET"),
            Pair.create("LFDH", "AUCH GERS"),
            Pair.create("LFLW", "AURILLAC"),
            Pair.create("LFLA", "AUXERRE BRANCHES"),
            Pair.create("LFMV", "AVIGNON CAUMONT"),
            Pair.create("LFOA", "AVORD"),
            Pair.create("LFSB", "BALE MULHOUSE"),
            Pair.create("LFKB", "BASTIA PORETTA"),
            Pair.create("LFOB", "BEAUVAIS TILLE"),
            Pair.create("LFBE", "BERGERAC DORDOGNE PERIGORD"),
            Pair.create("LFQM", "BESANCON LA VEZE"),
            Pair.create("LFMU", "BEZIERS VIAS"),
            Pair.create("LFBZ", "BIARRITZ PAYS BASQUE"),
            Pair.create("LFBS", "BISCAROSSE PARENTIS"),
            Pair.create("LFOQ", "BLOIS LE BREUIL"),
            Pair.create("LFBD", "BORDEAUX MERIGNAC"),
            Pair.create("LFLD", "BOURGES"),
            Pair.create("LFRB", "BREST BRETAGNE"),
            Pair.create("LFSL", "BRIVE SOUILLAC"),
            Pair.create("LFRK", "CAEN CARPIQUET"),
            Pair.create("LFCC", "CAHORS LALBENDIQUE"),
            Pair.create("LFAC", "CALAIS MARCK"),
            Pair.create("LFKC", "CALVI SAINTE CATHERINE"),
            Pair.create("LFMD", "CANNES MANDELIEU"),
            Pair.create("LFMK", "CARCASSONNE SALVAZA"),
            Pair.create("LFCK", "CASTRES MAZAMET"),
            Pair.create("LFBC", "CAZAUX"),
            Pair.create("LFLH", "CHALON CHAMPFORGEUIL"),
            Pair.create("LFOK", "CHALONS VATRY"),
            Pair.create("LFLB", "CHAMBERY AIX LES BAINS"),
            Pair.create("LFJY", "CHAMBLEY"),
            Pair.create("LFOC", "CHATEAUDUN"),
            Pair.create("LFLX", "CHATEAUROUX DEOLS"),
            Pair.create("LFRC", "CHERBOURG MAUPERTUS"),
            Pair.create("LFOU", "CHOLET LE PONTREAU"),
            Pair.create("LFLC", "CLERMONT FERRRAND AUVERGNE"),
            Pair.create("LFBG", "COGNAC CHATEAUBERNARD"),
            Pair.create("LFGA", "COLMAR HOUSSEN"),
            Pair.create("LFRG", "DEAUVILLE NORMANDIE"),
            Pair.create("LFAB", "DIEPPE SAINT AUBIN"),
            Pair.create("LFSD", "DIJON LONGVIC"),
            Pair.create("LFRD", "DINARD PLEUTRUIT SAINT MALO"),
            Pair.create("LFGJ", "DOLE TAVAUX"),
            Pair.create("LFSG", "EPINAL MIRECOURT"),
            Pair.create("LFQE", "ETAIN ROUVRES"),
            Pair.create("LFOE", "EVREUX FAUVILLE"),
            Pair.create("LFKF", "FIGARI SUD CORSE"),
            Pair.create("LFFK", "FONTENAY LE COMTE"),
            Pair.create("LFEV", "GRAY SAINT ADRIEN"),
            Pair.create("LFLS", "GRENOBLE ALPES ISERE"),
            Pair.create("LFTH", "HYERES LE PALYVESTRE"),
            Pair.create("LFEY", "ILE D'YEU"),
            Pair.create("LFMI", "ISTRES LE TUBE"),
            Pair.create("LFTZ", "LA MOLE"),
            Pair.create("LFRI", "LA ROCHE SUR YON "),
            Pair.create("LFBH", "LA ROCHELLE"),
            Pair.create("LFRJ", "LANDIVISIAU"),
            Pair.create("LFRO", "LANNION"),
            Pair.create("LFRL", "LANVEOC POULMIC"),
            Pair.create("LFOV", "LAVAL ENTRAMMES"),
            Pair.create("LFMQ", "LE CASTELLET"),
            Pair.create("LFOH", "LE HAVRE OCTEVILLE"),
            Pair.create("LFMC", "LE LUC LE CANET"),
            Pair.create("LFRM", "LE MANS ARNAGE"),
            Pair.create("LFHP", "LE PUY LOURDES"),
            Pair.create("LFAT", "LE TOUQUET COTE D'OPALE"),
            Pair.create("LFQQ", "LILLE LESQUIN"),
            Pair.create("LFBL", "LIMOGES BELLEGARDE"),
            Pair.create("LFRH", "LORIENT LANN BIHOUE"),
            Pair.create("LFSX", "LUXEUIL SAINT SAUVEUR"),
            Pair.create("LFLY", "LYON BRON"),
            Pair.create("LFLL", "LYON SAINT EXUPERY"),
            Pair.create("LFML", "MARSEILLE PROVENCE"),
            Pair.create("LFPM", "MELUN VILLAROCHE"),
            Pair.create("LFNB", "MENDE BRENOUX"),
            Pair.create("LFQT", "MERVILLE CALONNE"),
            Pair.create("LFJL", "METZ NANCY"),
            Pair.create("LFBM", "MONT DE MARSAN"),
            Pair.create("LFSM", "MONTBELLIARD COURCELLES"),
            Pair.create("LFBK", "MONTLUCON GUERET"),
            Pair.create("LFMT", "MONTPELLIER MEDITARRANEE"),
            Pair.create("LFRU", "MORLAIX PLOUJEAN"),
            Pair.create("LFHY", "MOULINS MONTBEUGNY"),
            Pair.create("LFBR", "MURET LHERM"),
            Pair.create("LFSN", "NANCY ESSEY"),
            Pair.create("LFSO", "NANCY OCHEY"),
            Pair.create("LFRS", "NANTES ATLANTIQUE"),
            Pair.create("LFQG", "NEVERS FOURCHAMBAULT"),
            Pair.create("LFMN", "NICE COTE D'AZUR"),
            Pair.create("LFTW", "NIMES GARONS"),
            Pair.create("LFBN", "NIORT MARAIS POITEVIN"),
            Pair.create("LFMO", "ORANGE CARITAT"),
            Pair.create("LFOJ", "ORLEANS BRICY"),
            Pair.create("LFOZ", "ORLEANS SAINT DENIS"),
            Pair.create("LFEC", "OUESSANT"),
            Pair.create("LFDJ", "PAMIERS LES PUJOLS"),
            Pair.create("LFPG", "PARIS CHARLES DE GAULLE"),
            Pair.create("LFPB", "PARIS LE BOURGET"),
            Pair.create("LFPO", "PARIS ORLY"),
            Pair.create("LFBP", "PAU PYRENNES"),
            Pair.create("LFBX", "PERRIGUEUX BASSILLAC"),
            Pair.create("LFMP", "PERPIGNAN RIVESALTES"),
            Pair.create("LFQP", "PHALSBOURG BOURSHEID"),
            Pair.create("LFBI", "POITIERS BIARD"),
            Pair.create("LFPT", "PONTOISE CORMEILLES EN VEXIN"),
            Pair.create("LFRQ", "QUIMPER PLUGUFFAN"),
            Pair.create("LFQA", "REIMS PRUNAY"),
            Pair.create("LFRN", "RENNES SAINT JACQUES"),
            Pair.create("LFLO", "ROANNE"),
            Pair.create("LFDN", "ROCHEFORT"),
            Pair.create("LFCR", "RODEZ AVEYRON"),
            Pair.create("LFOP", "ROUEN VALLEE DE SEIN"),
            Pair.create("LFCY", "ROYAN MEDIS"),
            Pair.create("LFRT", "SAINT BRIEUC ARMOR"),
            Pair.create("LFSI", "SAINT DIZIER"),
            Pair.create("LFMH", "SAINT ETIENNE LOIRE"),
            Pair.create("LFRZ", "SAINT NAZAIRE MONTOIR"),
            Pair.create("LFLN", "SAINT YAN"),
            Pair.create("LFMY", "SALON DE PROVENCE"),
            Pair.create("LFKS", "SOLENZARA"),
            Pair.create("LFST", "STRASBOURG ENTZHEIM"),
            Pair.create("LFBT", "TARBES LOURDES PYRENEES"),
            Pair.create("LFBO", "TOULOUSE BLAGNAC"),
            Pair.create("LFBF", "TOULOUSE FRANCAZAL"),
            Pair.create("LFOT", "TOURS VAL DE LOIRE."),
            Pair.create("LFPN", "TOUSSUS LE NOBLE"),
            Pair.create("LFQB", "TROYES BARBEREY."),
            Pair.create("LFLU", "VALENCE CHABEUIL"),
            Pair.create("LFAV", "VALENCIENNES DENAIN"),
            Pair.create("LFRV", "VANNES MEUCON"),
            Pair.create("LFLV", "VICHY CHARMEIL"),
            Pair.create("LFPV", "VILLACOUBLAY VELLIZY."),
            Pair.create("LFHV", "VILLEFRANCHE TARARE")


    );

    @Override
    public int getItemCount() {
        return characters.size();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_cell, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Pair<String, String> pair = characters.get(position);
        holder.display(pair);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private final TextView name;
        private final TextView description;
        private static final String googleDocsUrl = "http://docs.google.com/viewer?url=";


        private Pair<String, String> currentPair;

        public MyViewHolder(final View itemView) {
            super(itemView);

            name = ((TextView) itemView.findViewById(R.id.textViewAirport));
            description = ((TextView) itemView.findViewById(R.id.textView6));

           /* yourButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(.this, PdfView.class));
                    //goToPdf();
                }
            });*/


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                   // new AlertDialog.Builder(itemView.getContext())
                            //.setTitle(currentPair.first)
                           // .setMessage(currentPair.second)
                            //.show();



                    //Intent intent = new Intent(this,PdfViewActivity.class);
                    if(name.getText()=="LFBA"|| description.getText()=="AGEN LA GARENNE") {
                        Intent intent = new Intent(view.getContext(), PdfActivity.class);
                        view.getContext().startActivity(intent);
                    }else if(name.getText()=="LFMA"|| description.getText()=="AIX LES MILLES") {
                        Intent intent1 = new Intent(view.getContext(), LfmaActivity.class);
                        view.getContext().startActivity(intent1);
                    }else if(name.getText()=="LFKJ"|| description.getText()=="AJACCIO NAPOLEON BONAPARTE"){
                        Intent intent2 = new Intent(view.getContext(), LfkjActivity.class);
                        view.getContext().startActivity(intent2);
                    }else if(name.getText()=="LFAQ"|| description.getText()=="ALBERT BRAY"){
                        Intent intent3 = new Intent(view.getContext(), LfaqActivity.class);
                        view.getContext().startActivity(intent3);
                    }else if(name.getText()=="LFCI"|| description.getText()=="ALBI LE SEQUESTRE"){
                        Intent intent4 = new Intent(view.getContext(), LfciActivity.class);
                        view.getContext().startActivity(intent4);
                    }else if(name.getText()=="LFKJ"|| description.getText()=="AJACCIO NAPOLEON BONAPARTE"){
                        Intent intent2 = new Intent(view.getContext(), LfkjActivity.class);
                        view.getContext().startActivity(intent2);
                    }else if(name.getText()=="LFAQ"|| description.getText()=="ALBERT BRAY"){
                        Intent intent3 = new Intent(view.getContext(), LfaqActivity.class);
                        view.getContext().startActivity(intent3);
                    }else if(name.getText()=="LFCI"|| description.getText()=="ALBI LE SEQUESTRE"){
                        Intent intent4 = new Intent(view.getContext(), LfciActivity.class);
                        view.getContext().startActivity(intent4);
                    }else if(name.getText()=="LAFAY"|| description.getText()=="AMIENS-GLISY"){
                        Intent intent5 = new Intent(view.getContext(), LfayActivity.class);
                        view.getContext().startActivity(intent5);
                    }else if(name.getText()=="LFJR"|| description.getText()=="ANGERS MARCE"){
                        Intent intent6 = new Intent(view.getContext(), LfjrActivity.class);
                        view.getContext().startActivity(intent6);
                    }else if(name.getText()=="LFBU"|| description.getText()=="ANGOULEME BRIE CHAMPNIERS"){
                        Intent intent7 = new Intent(view.getContext(), LfbuActivity.class);
                        view.getContext().startActivity(intent7);
                    }else if(name.getText()=="LFLP"|| description.getText()=="ANNECY MEYTHET"){
                        Intent intent8 = new Intent(view.getContext(), LflpActivity.class);
                        view.getContext().startActivity(intent8);
                    }else if(name.getText()=="LFDH"|| description.getText()=="AUCH GERS"){
                        Intent intent9 = new Intent(view.getContext(), LfdhActivity.class);
                        view.getContext().startActivity(intent9);
                    }else if(name.getText()=="LFLW"|| description.getText()=="AURILLAC"){
                        Intent intent10 = new Intent(view.getContext(), LflwActivity.class);
                        view.getContext().startActivity(intent10);
                    }else if(name.getText()=="LFLA"|| description.getText()=="AUXERRE BRANCHES"){
                        Intent intent11 = new Intent(view.getContext(), LflaActivity.class);
                        view.getContext().startActivity(intent11);
                    }else if(name.getText()=="LFMV"|| description.getText()=="AVIGNON CAUMONT"){
                        Intent intent12 = new Intent(view.getContext(), LfmvActivity.class);
                        view.getContext().startActivity(intent12);
                    }else if(name.getText()=="LFOA"|| description.getText()=="AVORD"){
                        Intent intent13 = new Intent(view.getContext(), LfoaActivity.class);
                        view.getContext().startActivity(intent13);
                    }else if(name.getText()=="LFSB"|| description.getText()=="BALE-MULHOUSE"){
                        Intent intent14 = new Intent(view.getContext(), LfsbActivity.class);
                        view.getContext().startActivity(intent14);
                    }else if(name.getText()=="LFKB"|| description.getText()=="BASTIA PORETTA"){
                        Intent intent15 = new Intent(view.getContext(), LfkbActivity.class);
                        view.getContext().startActivity(intent15);
                    }else if(name.getText()=="LFOB"|| description.getText()=="BEAUVAIS TILLE"){
                        Intent intent16 = new Intent(view.getContext(), LfobActivity.class);
                        view.getContext().startActivity(intent16);
                    }else if(name.getText()=="LFBE"|| description.getText()=="BERGERAC DORDOGNE PERIGORD"){
                        Intent intent17 = new Intent(view.getContext(), LfbeActivity.class);
                        view.getContext().startActivity(intent17);
                    }else if(name.getText()=="LFQM"|| description.getText()=="BESANCON LA VEZE"){
                        Intent intent18 = new Intent(view.getContext(), LfqmActivity.class);
                        view.getContext().startActivity(intent18);
                    }else if(name.getText()=="LFMU"|| description.getText()=="BEZIERS VIAS"){
                        Intent intent19 = new Intent(view.getContext(), LfmuActivity.class);
                        view.getContext().startActivity(intent19);
                    }else if(name.getText()=="LFBZ"|| description.getText()=="BIARRITZ PAYS BASQUE"){
                        Intent intent20 = new Intent(view.getContext(), LfbzActivity.class);
                        view.getContext().startActivity(intent20);
                    }else if(name.getText()=="LFBS"|| description.getText()=="BISCAROSSE PARENTIS"){
                        Intent intent21 = new Intent(view.getContext(), LfbsActivity.class);
                        view.getContext().startActivity(intent21);
                    }else if(name.getText()=="LFOQ"|| description.getText()=="BLOIS LE BREUIL"){
                        Intent intent22 = new Intent(view.getContext(), LfoqActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFBD"|| description.getText()=="BORDEUX MERIGNAC"){
                        Intent intent = new Intent(view.getContext(), LfbdActivity.class);
                        view.getContext().startActivity(intent);
                    }else if(name.getText()=="LFLD"|| description.getText()=="BOURGES"){
                        Intent intent13 = new Intent(view.getContext(), LfldActivity.class);
                        view.getContext().startActivity(intent13);
                    }else if(name.getText()=="LFRB"|| description.getText()=="BREST BRETAGNE"){
                        Intent intent14 = new Intent(view.getContext(), LfrbActivity.class);
                        view.getContext().startActivity(intent14);
                    }else if(name.getText()=="LFSL"|| description.getText()=="BRIVE SOUILLAC"){
                        Intent intent15 = new Intent(view.getContext(), LfslActivity.class);
                        view.getContext().startActivity(intent15);
                    }else if(name.getText()=="LFRK"|| description.getText()=="CAEN CARPIQUET"){
                        Intent intent16 = new Intent(view.getContext(), LfrkActivity.class);
                        view.getContext().startActivity(intent16);
                    }else if(name.getText()=="LFCC"|| description.getText()=="CAHORS LALBENQUE"){
                        Intent intent17 = new Intent(view.getContext(), LfccActivity.class);
                        view.getContext().startActivity(intent17);
                    }else if(name.getText()=="LFAC"|| description.getText()=="CALAIS MARCK"){
                        Intent intent18 = new Intent(view.getContext(), LfacActivity.class);
                        view.getContext().startActivity(intent18);
                    }else if(name.getText()=="LFKC"|| description.getText()=="CALVI SAINTE CATHERINE"){
                        Intent intent19 = new Intent(view.getContext(), LfkcActivity.class);
                        view.getContext().startActivity(intent19);
                    }else if(name.getText()=="LFMD"|| description.getText()=="CANNES MANDELIEU"){
                        Intent intent20 = new Intent(view.getContext(), LfmdActivity.class);
                        view.getContext().startActivity(intent20);
                    }else if(name.getText()=="LFMK"|| description.getText()=="CARCASSONNE SALVAZA"){
                        Intent intent21 = new Intent(view.getContext(), LfmkActivity.class);
                        view.getContext().startActivity(intent21);
                    }else if(name.getText()=="LFCK"|| description.getText()=="CASTRES MAZAMET"){
                        Intent intent22 = new Intent(view.getContext(), LfckActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFBC"|| description.getText()=="CAZAUX"){
                        Intent intent12 = new Intent(view.getContext(), LfbcActivity.class);
                        view.getContext().startActivity(intent12);
                    }else if(name.getText()=="LFLH"|| description.getText()=="CHALON CHAMPFORGEUIL"){
                        Intent intent13 = new Intent(view.getContext(), LflhActivity.class);
                        view.getContext().startActivity(intent13);
                    }else if(name.getText()=="LFOK"|| description.getText()=="CHALONS VATRY"){
                        Intent intent14 = new Intent(view.getContext(), LfokActivity.class);
                        view.getContext().startActivity(intent14);
                    }else if(name.getText()=="LFLB"|| description.getText()=="CHAMBERY AIX LES BAINS"){
                        Intent intent15 = new Intent(view.getContext(), LflbActivity.class);
                        view.getContext().startActivity(intent15);
                    }else if(name.getText()=="LFJY"|| description.getText()=="CHAMBLEY"){
                        Intent intent16 = new Intent(view.getContext(), LfjyActivity.class);
                        view.getContext().startActivity(intent16);
                    }else if(name.getText()=="LFOC"|| description.getText()=="CHATEAUDUN"){
                        Intent intent17 = new Intent(view.getContext(), LfocActivity.class);
                        view.getContext().startActivity(intent17);
                    }else if(name.getText()=="LFLX"|| description.getText()=="CHATEAUDUN DEOLS"){
                        Intent intent18 = new Intent(view.getContext(), LflxActivity.class);
                        view.getContext().startActivity(intent18);
                    }else if(name.getText()=="LFRC"|| description.getText()=="CHERBOURG MAUPERTUS"){
                        Intent intent19 = new Intent(view.getContext(), LfrcActivity.class);
                        view.getContext().startActivity(intent19);
                    }else if(name.getText()=="LFOU"|| description.getText()=="CHOLET LE PONTREAU"){
                        Intent intent20 = new Intent(view.getContext(), LfouActivity.class);
                        view.getContext().startActivity(intent20);
                    }else if(name.getText()=="LFLC"|| description.getText()=="CLERMONT FERRAND AUVERGNE"){
                        Intent intent21 = new Intent(view.getContext(), LflcActivity.class);
                        view.getContext().startActivity(intent21);
                    }else if(name.getText()=="LFBG"|| description.getText()=="COGNAC CHATEAUBERNARD"){
                        Intent intent22 = new Intent(view.getContext(), LfbgActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFGA"|| description.getText()=="COLMAR HOUSSEN"){
                        Intent intent12 = new Intent(view.getContext(), LfgaActivity.class);
                        view.getContext().startActivity(intent12);
                    }else if(name.getText()=="LFRG"|| description.getText()=="DEAUVILLE NORMANDIE"){
                        Intent intent13 = new Intent(view.getContext(), LfrgActivity.class);
                        view.getContext().startActivity(intent13);
                    }else if(name.getText()=="LFAB"|| description.getText()=="DIEPPE SAINT AUBIN"){
                        Intent intent14 = new Intent(view.getContext(), LfabActivity.class);
                        view.getContext().startActivity(intent14);
                    }else if(name.getText()=="LFSD"|| description.getText()=="DIJON LONGVIC"){
                        Intent intent15 = new Intent(view.getContext(), LfsdActivity.class);
                        view.getContext().startActivity(intent15);
                    }else if(name.getText()=="LFRD"|| description.getText()=="DINARD PLEURTUIT SAINT MALO"){
                        Intent intent16 = new Intent(view.getContext(), LfrdActivity.class);
                        view.getContext().startActivity(intent16);
                    }else if(name.getText()=="LFGJ"|| description.getText()=="DOLE TAVAUX"){
                        Intent intent17 = new Intent(view.getContext(), LfgjActivity.class);
                        view.getContext().startActivity(intent17);
                    }else if(name.getText()=="LFSG"|| description.getText()=="EPINAL MIRECOURT"){
                        Intent intent18 = new Intent(view.getContext(), LfsgActivity.class);
                        view.getContext().startActivity(intent18);
                    }else if(name.getText()=="LFQE"|| description.getText()=="ETAIN ROUVRES"){
                        Intent intent19 = new Intent(view.getContext(), LfqeActivity.class);
                        view.getContext().startActivity(intent19);
                    }else if(name.getText()=="LFOE"|| description.getText()=="EVREUX FAUVILLE"){
                        Intent intent20 = new Intent(view.getContext(), LfoeActivity.class);
                        view.getContext().startActivity(intent20);
                    }else if(name.getText()=="LFKF"|| description.getText()=="FIGARI SUD CORSE"){
                        Intent intent21 = new Intent(view.getContext(), LfkfActivity.class);
                        view.getContext().startActivity(intent21);
                    }else if(name.getText()=="LFFK"|| description.getText()=="FONTENAY LE COMTE"){
                        Intent intent22 = new Intent(view.getContext(), LffkActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFEV"|| description.getText()=="GRAY SAINT ADRIEN"){
                        Intent intent12 = new Intent(view.getContext(), LfevActivity.class);
                        view.getContext().startActivity(intent12);
                    }else if(name.getText()=="LFLS"|| description.getText()=="GRENOBLE ALPES ISERE"){
                        Intent intent13 = new Intent(view.getContext(), LflsActivity.class);
                        view.getContext().startActivity(intent13);
                    }else if(name.getText()=="LFTH"|| description.getText()=="HYERES LE PALYVESTRE"){
                        Intent intent14 = new Intent(view.getContext(), LfthActivity.class);
                        view.getContext().startActivity(intent14);
                    }else if(name.getText()=="LFEY"|| description.getText()=="ILE D'YEU"){
                        Intent intent15 = new Intent(view.getContext(), LfeyActivity.class);
                        view.getContext().startActivity(intent15);
                    }else if(name.getText()=="LFMI"|| description.getText()=="ISTRES LE TUBE"){
                        Intent intent16 = new Intent(view.getContext(), LfmiActivity.class);
                        view.getContext().startActivity(intent16);
                    }else if(name.getText()=="LFTZ"|| description.getText()=="LA MOLE"){
                        Intent intent17 = new Intent(view.getContext(), LftzActivity.class);
                        view.getContext().startActivity(intent17);
                    }else if(name.getText()=="LFRI"|| description.getText()=="LA ROCHE SUR YON"){
                        Intent intent18 = new Intent(view.getContext(), LfriActivity.class);
                        view.getContext().startActivity(intent18);
                    }else if(name.getText()=="LFBH"|| description.getText()=="LA ROCHELLE ILE DE RE"){
                        Intent intent19 = new Intent(view.getContext(), LfbhActivity.class);
                        view.getContext().startActivity(intent19);
                    }else if(name.getText()=="LFRJ"|| description.getText()=="LANDIVISIAU"){
                        Intent intent20 = new Intent(view.getContext(), LfrjActivity.class);
                        view.getContext().startActivity(intent20);
                    }else if(name.getText()=="LFRO"|| description.getText()=="LANNION"){
                        Intent intent21 = new Intent(view.getContext(), LfroActivity.class);
                        view.getContext().startActivity(intent21);
                    }else if(name.getText()=="LFRL"|| description.getText()=="LANVEOC POULMIC"){
                        Intent intent22 = new Intent(view.getContext(), LfrlActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFOV"|| description.getText()=="LAVAL ENTRAMMES"){
                        Intent intent12 = new Intent(view.getContext(), LfovActivity.class);
                        view.getContext().startActivity(intent12);
                    }else if(name.getText()=="LFMQ"|| description.getText()=="LE CASTELLET"){
                        Intent intent13 = new Intent(view.getContext(), LfmqActivity.class);
                        view.getContext().startActivity(intent13);
                    }else if(name.getText()=="LFOH"|| description.getText()=="LE HAVRE OCTEVILLE"){
                        Intent intent14 = new Intent(view.getContext(), LfohActivity.class);
                        view.getContext().startActivity(intent14);
                    }else if(name.getText()=="LFMC"|| description.getText()=="LE LUC LE CANNET"){
                        Intent intent15 = new Intent(view.getContext(), LfmcActivity.class);
                        view.getContext().startActivity(intent15);
                    }else if(name.getText()=="LFRM"|| description.getText()=="LE MANS ARNAGE"){
                        Intent intent16 = new Intent(view.getContext(), LfrmActivity.class);
                        view.getContext().startActivity(intent16);
                    }else if(name.getText()=="LFHP"|| description.getText()=="LE PUY LOUDES"){
                        Intent intent17 = new Intent(view.getContext(), LfhpActivity.class);
                        view.getContext().startActivity(intent17);
                    }else if(name.getText()=="LFAT"|| description.getText()=="LE TOUQUET COTE D'OPALE"){
                        Intent intent18 = new Intent(view.getContext(), LfatActivity.class);
                        view.getContext().startActivity(intent18);
                    }else if(name.getText()=="LFQQ"|| description.getText()=="LILLE LESQUIN"){
                        Intent intent19 = new Intent(view.getContext(), LfqqActivity.class);
                        view.getContext().startActivity(intent19);
                    }else if(name.getText()=="LFBL"|| description.getText()=="LIMOGES BELLEGARDE"){
                        Intent intent20 = new Intent(view.getContext(), LfblActivity.class);
                        view.getContext().startActivity(intent20);
                    }else if(name.getText()=="LFRH"|| description.getText()=="LORIENT LANN BIHOUE"){
                        Intent intent21 = new Intent(view.getContext(), LfrhActivity.class);
                        view.getContext().startActivity(intent21);
                    }else if(name.getText()=="LFSX"|| description.getText()=="LUXEUIL SAINT SAUVEUR"){
                        Intent intent22 = new Intent(view.getContext(), LfsxActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFLY"|| description.getText()=="LYON BRONT"){
                        Intent intent12 = new Intent(view.getContext(), LflyActivity.class);
                        view.getContext().startActivity(intent12);
                    }else if(name.getText()=="LFLL"|| description.getText()=="LYON SAINT EXUPERY"){
                        Intent intent13 = new Intent(view.getContext(), LfllActivity.class);
                        view.getContext().startActivity(intent13);
                    }else if(name.getText()=="LFML"|| description.getText()=="MARSEILLE PROVENCE"){
                        Intent intent14 = new Intent(view.getContext(), LfmlActivity.class);
                        view.getContext().startActivity(intent14);
                    }else if(name.getText()=="LFPM"|| description.getText()=="MELUN VILLAROCHE"){
                        Intent intent15 = new Intent(view.getContext(), LfpmActivity.class);
                        view.getContext().startActivity(intent15);
                    }else if(name.getText()=="LFNB"|| description.getText()=="MENDE BRENOUX"){
                        Intent intent16 = new Intent(view.getContext(), LfnbActivity.class);
                        view.getContext().startActivity(intent16);
                    }else if(name.getText()=="LFQT"|| description.getText()=="MERVILLE CALONNE"){
                        Intent intent17 = new Intent(view.getContext(), LfqtActivity.class);
                        view.getContext().startActivity(intent17);
                    }else if(name.getText()=="LFJL"|| description.getText()=="METZ NANCY LORRAINE"){
                        Intent intent18 = new Intent(view.getContext(), LfjlActivity.class);
                        view.getContext().startActivity(intent18);
                    }else if(name.getText()=="LFBM"|| description.getText()=="MONT DE MARSAN"){
                        Intent intent19 = new Intent(view.getContext(), LfbmActivity.class);
                        view.getContext().startActivity(intent19);
                    }else if(name.getText()=="LFSM"|| description.getText()=="MONTBELLIARD COURCELLES"){
                        Intent intent20 = new Intent(view.getContext(), LfsmActivity.class);
                        view.getContext().startActivity(intent20);
                    }else if(name.getText()=="LFBK"|| description.getText()=="MONTLUCON GUERET"){
                        Intent intent21 = new Intent(view.getContext(), LfbkActivity.class);
                        view.getContext().startActivity(intent21);
                    }else if(name.getText()=="LFMT"|| description.getText()=="MONTPELLIER MEDITERRANEE"){
                        Intent intent22 = new Intent(view.getContext(), LfmtActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFRU"|| description.getText()=="MORLAIX PLOUJEAN"){
                        Intent intent12 = new Intent(view.getContext(), LfruActivity.class);
                        view.getContext().startActivity(intent12);
                    }else if(name.getText()=="LFHY"|| description.getText()=="MOULINS MONTBEUGNY"){
                        Intent intent13 = new Intent(view.getContext(), LfhyActivity.class);
                        view.getContext().startActivity(intent13);
                    }else if(name.getText()=="LFBR"|| description.getText()=="MURET LHERM"){
                        Intent intent14 = new Intent(view.getContext(), LfbrActivity.class);
                        view.getContext().startActivity(intent14);
                    }else if(name.getText()=="LFSN"|| description.getText()=="NANCY ESSEY"){
                        Intent intent15 = new Intent(view.getContext(), LfsnActivity.class);
                        view.getContext().startActivity(intent15);
                    }else if(name.getText()=="LFSO"|| description.getText()=="NANCY OCHEY"){
                        Intent intent16 = new Intent(view.getContext(), LfsoActivity.class);
                        view.getContext().startActivity(intent16);
                    }else if(name.getText()=="LFRS"|| description.getText()=="NANTES ATLANTIQUE"){
                        Intent intent17 = new Intent(view.getContext(), LfrsActivity.class);
                        view.getContext().startActivity(intent17);
                    }else if(name.getText()=="LFQG"|| description.getText()=="NEVERS FOURCHAMBAULT"){
                        Intent intent18 = new Intent(view.getContext(), LfqgActivity.class);
                        view.getContext().startActivity(intent18);
                    }else if(name.getText()=="LFMN"|| description.getText()=="NICE COTE D'AZUR"){
                        Intent intent19 = new Intent(view.getContext(), LfmnActivity.class);
                        view.getContext().startActivity(intent19);
                    }else if(name.getText()=="LFTW"|| description.getText()=="NIMES GARONS"){
                        Intent intent20 = new Intent(view.getContext(), LftwActivity.class);
                        view.getContext().startActivity(intent20);
                    }else if(name.getText()=="LFBN"|| description.getText()=="NIORT MARAIS POITEVIN"){
                        Intent intent21 = new Intent(view.getContext(), LfbnActivity.class);
                        view.getContext().startActivity(intent21);
                    }else if(name.getText()=="LFMO"|| description.getText()=="ORANGE CARITAT"){
                        Intent intent22 = new Intent(view.getContext(), LfmoActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFOJ"|| description.getText()=="ORLEANS BRICY"){
                        Intent intent20 = new Intent(view.getContext(), LfojActivity.class);
                        view.getContext().startActivity(intent20);
                    }else if(name.getText()=="LFOZ"|| description.getText()=="ORLEANS SAINT DENIS L'HOTEL"){
                        Intent intent21 = new Intent(view.getContext(), LfozActivity.class);
                        view.getContext().startActivity(intent21);
                    }else if(name.getText()=="LFEC"|| description.getText()=="OUESSANT"){
                        Intent intent22 = new Intent(view.getContext(), LfecActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFDJ"|| description.getText()=="PAMIERS LES PUJOLS"){
                        Intent intent20 = new Intent(view.getContext(), LfdjActivity.class);
                        view.getContext().startActivity(intent20);
                    }else if(name.getText()=="LFPG"|| description.getText()=="PARIS CHARLES DE GAULLE"){
                        Intent intent21 = new Intent(view.getContext(), LfpgActivity.class);
                        view.getContext().startActivity(intent21);
                    }else if(name.getText()=="LFPB"|| description.getText()=="PARIS LE BOURGET"){
                        Intent intent22 = new Intent(view.getContext(), LfpbActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFPO"|| description.getText()=="PARIS ORLY"){
                        Intent intent20 = new Intent(view.getContext(), LfpoActivity.class);
                        view.getContext().startActivity(intent20);
                    }else if(name.getText()=="LFBP"|| description.getText()=="PAU PYRENEES"){
                        Intent intent21 = new Intent(view.getContext(), LfbpActivity.class);
                        view.getContext().startActivity(intent21);
                    }else if(name.getText()=="LFBX"|| description.getText()=="PERIGUEUX BASSILLAC"){
                        Intent intent22 = new Intent(view.getContext(), LfbxActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFMP"|| description.getText()=="PERPIGNAN RIVESALTES"){
                        Intent intent20 = new Intent(view.getContext(), LfmpActivity.class);
                        view.getContext().startActivity(intent20);
                    }else if(name.getText()=="LFQP"|| description.getText()=="PHALSBOURG BOURSHEID"){
                        Intent intent21 = new Intent(view.getContext(), LfqpActivity.class);
                        view.getContext().startActivity(intent21);
                    }else if(name.getText()=="LFBI"|| description.getText()=="POITIERS BIARD"){
                        Intent intent22 = new Intent(view.getContext(), LfbiActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFPT"|| description.getText()=="PONTOISE CORMEILLES EN VEXIN"){
                        Intent intent20 = new Intent(view.getContext(), LfptActivity.class);
                        view.getContext().startActivity(intent20);
                    }else if(name.getText()=="LFRQ"|| description.getText()=="QUIMPER PLUGUFFAN"){
                        Intent intent21 = new Intent(view.getContext(), LfrqActivity.class);
                        view.getContext().startActivity(intent21);
                    }else if(name.getText()=="LFQA"|| description.getText()=="REIMS PRUNAY"){
                        Intent intent22 = new Intent(view.getContext(), LfqaActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFRN"|| description.getText()=="RENNES SAINT JACQUES"){
                        Intent intent20 = new Intent(view.getContext(), LfrnActivity.class);
                        view.getContext().startActivity(intent20);
                    }else if(name.getText()=="LFLO"|| description.getText()=="ROANNE"){
                        Intent intent21 = new Intent(view.getContext(), LfloActivity.class);
                        view.getContext().startActivity(intent21);
                    }else if(name.getText()=="LFDN"|| description.getText()=="ROCHEFORT CHARENTE-MARITIME"){
                        Intent intent22 = new Intent(view.getContext(), LfdnActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFCR"|| description.getText()=="RODEZ AVEYRON"){
                        Intent intent20 = new Intent(view.getContext(), LfcrActivity.class);
                        view.getContext().startActivity(intent20);
                    }else if(name.getText()=="LFOP"|| description.getText()=="ROUEN VALLE DE SEINE"){
                        Intent intent21 = new Intent(view.getContext(), LfopActivity.class);
                        view.getContext().startActivity(intent21);
                    }else if(name.getText()=="LFCY"|| description.getText()=="ROYAN MEDIS"){
                        Intent intent22 = new Intent(view.getContext(), LfcyActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFRT"|| description.getText()=="SAINT BRIEUC ARMOR"){
                        Intent intent20 = new Intent(view.getContext(), LfrtActivity.class);
                        view.getContext().startActivity(intent20);
                    }else if(name.getText()=="LFSI"|| description.getText()=="SAINT DIZIER ROBINSON"){
                        Intent intent21 = new Intent(view.getContext(), LfsiActivity.class);
                        view.getContext().startActivity(intent21);
                    }else if(name.getText()=="LFMH"|| description.getText()=="SAINT ETIENNE LOIRE"){
                        Intent intent22 = new Intent(view.getContext(), LfmhActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFRZ"|| description.getText()=="SAINT NAZAIRE"){
                        Intent intent22 = new Intent(view.getContext(), LfrzActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFLN"|| description.getText()=="SAINT YAN"){
                        Intent intent22 = new Intent(view.getContext(), LflnActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFMY"|| description.getText()=="SALON DE PROVENCE"){
                        Intent intent22 = new Intent(view.getContext(), LfmyActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFKS"|| description.getText()=="SOLENZARA"){
                        Intent intent22 = new Intent(view.getContext(), LfksActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFST"|| description.getText()=="STRASBOURG ENTZHEIM"){
                        Intent intent22 = new Intent(view.getContext(), LfstActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFBT"|| description.getText()=="TARBES LOURDES PYRENEES"){
                        Intent intent22 = new Intent(view.getContext(), LfbtActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFBO"|| description.getText()=="TOULOUSE BLAGNAC"){
                        Intent intent22 = new Intent(view.getContext(), LfboActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFBF"|| description.getText()=="TOULOUSE FRANCAZAL"){
                        Intent intent22 = new Intent(view.getContext(), LfbfActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFOT"|| description.getText()=="TOURS VAL DE LOIRE"){
                        Intent intent22 = new Intent(view.getContext(), LfotActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFPN"|| description.getText()=="TOUSSUS LE NOBLE"){
                        Intent intent22 = new Intent(view.getContext(), LfpnActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFQB"|| description.getText()=="TROYES BARBEREY"){
                        Intent intent22 = new Intent(view.getContext(), LfqbActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFLU"|| description.getText()=="VALENCE CHABEUIL"){
                        Intent intent22 = new Intent(view.getContext(), LfluActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFAV"|| description.getText()=="VALENCIENNES DENAIN"){
                        Intent intent22 = new Intent(view.getContext(), LfavActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFRV"|| description.getText()=="VANNES MEUCON"){
                        Intent intent22 = new Intent(view.getContext(), LfrvActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFLV"|| description.getText()=="VIVHY CHARMEIL"){
                        Intent intent22 = new Intent(view.getContext(), LflvActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFPV"|| description.getText()=="VILLACOUBLAY VELIZY"){
                        Intent intent22 = new Intent(view.getContext(), LfpvActivity.class);
                        view.getContext().startActivity(intent22);
                    }else if(name.getText()=="LFHV"|| description.getText()=="VILLEFRANCHE TARARE"){
                        Intent intent22 = new Intent(view.getContext(), LfhvActivity.class);
                        view.getContext().startActivity(intent22);
                    }


                    //Intent intent = new Intent(Intent.ACTION_VIEW);
                   // intent.setDataAndType(Uri.parse(googleDocsUrl + "https://www.sia.aviation-civile.gouv.fr/dvd/eAIP_26_MAR_2020/FRANCE/AIRAC-2020-03-26/pdf/FR-AD-2.LFBA-fr-FR.pdf#AD-2.eAIP.LFBA"), "text/html");

                    // new Intent(PdfViewActivity);
                    //Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sia.aviation-civile.gouv.fr/dvd/eAIP_26_MAR_2020/FRANCE/AIRAC-2020-03-26/pdf/FR-AD-2.LFBA-fr-FR.pdf#AD-2.eAIP.LFBA"));
                    //startActivity(PdfViewActivity);



                    }
                });
            }


        public void display(Pair<String, String> pair) {
            currentPair = pair;
            name.setText(pair.first);
            description.setText(pair.second);
        }

        public void PdfGo(View v){
            name.getText();
            description.getText();
        }


    }

}
