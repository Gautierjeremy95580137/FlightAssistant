package com.example.flightassistant;



import android.app.AlertDialog;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private final List<Pair<String, String>> characters = Arrays.asList(
            Pair.create("LFBA", "AGEN LA GARENNE"),
            Pair.create("LFMA", "AIX LES MILLES"),
            Pair.create("LFKJ", "AJACCIO NAPOLEON BONAPARTE"),
            Pair.create("LFAQ", "ABERT BRAY"),
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

        private Pair<String, String> currentPair;

        public MyViewHolder(final View itemView) {
            super(itemView);

            name = ((TextView) itemView.findViewById(R.id.textViewAirport));
            description = ((TextView) itemView.findViewById(R.id.textView6));

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    new AlertDialog.Builder(itemView.getContext())
                            .setTitle(currentPair.first)
                            .setMessage(currentPair.second)
                            .show();
                }
            });
        }

        public void display(Pair<String, String> pair) {
            currentPair = pair;
            name.setText(pair.first);
            description.setText(pair.second);
        }
    }

}