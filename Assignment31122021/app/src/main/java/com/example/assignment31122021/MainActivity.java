package com.example.assignment31122021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String JSON = "[\n" +
            "  {\n" +
            "    \"id\": 1,\n" +
            "    \"name\": \"Leanne Graham\",\n" +
            "    \"username\": \"Bret\",\n" +
            "    \"email\": \"Sincere@april.biz\",\n" +
            "\t\"avatar\": {\n" +
            "\t  \"thumbnail\":\"/thumbs/thumb1.jpg\",\n" +
            "\t  \"photo\":\"/walls/wall1.jpg\"\n" +
            "\t},\n" +
            "    \"address\": {\n" +
            "      \"street\": \"Kulas Light\",\n" +
            "      \"suite\": \"Apt. 556\",\n" +
            "      \"city\": \"Gwenborough\",\n" +
            "      \"zipcode\": \"92998-3874\",\n" +
            "      \"geo\": {\n" +
            "        \"lat\": \"-37.3159\",\n" +
            "        \"lng\": \"81.1496\"\n" +
            "      }\n" +
            "    },\n" +
            "    \"phone\": \"1-770-736-8031 x56442\",\n" +
            "    \"website\": \"hildegard.org\",\n" +
            "    \"company\": {\n" +
            "      \"name\": \"Romaguera-Crona\",\n" +
            "      \"catchPhrase\": \"Multi-layered client-server neural-net\",\n" +
            "      \"bs\": \"harness real-time e-markets\"\n" +
            "    }\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2,\n" +
            "    \"name\": \"Ervin Howell\",\n" +
            "    \"username\": \"Antonette\",\n" +
            "    \"email\": \"Shanna@melissa.tv\",\n" +
            "\t\"avatar\": {\n" +
            "\t  \"thumbnail\":\"/thumbs/thumb2.jpg\",\n" +
            "\t  \"photo\":\"/walls/wall2.jpg\"\n" +
            "\t},\n" +
            "    \"address\": {\n" +
            "      \"street\": \"Victor Plains\",\n" +
            "      \"suite\": \"Suite 879\",\n" +
            "      \"city\": \"Wisokyburgh\",\n" +
            "      \"zipcode\": \"90566-7771\",\n" +
            "      \"geo\": {\n" +
            "        \"lat\": \"-43.9509\",\n" +
            "        \"lng\": \"-34.4618\"\n" +
            "      }\n" +
            "    },\n" +
            "    \"phone\": \"010-692-6593 x09125\",\n" +
            "    \"website\": \"anastasia.net\",\n" +
            "    \"company\": {\n" +
            "      \"name\": \"Deckow-Crist\",\n" +
            "      \"catchPhrase\": \"Proactive didactic contingency\",\n" +
            "      \"bs\": \"synergize scalable supply-chains\"\n" +
            "    }\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 3,\n" +
            "    \"name\": \"Clementine Bauch\",\n" +
            "    \"username\": \"Samantha\",\n" +
            "    \"email\": \"Nathan@yesenia.net\",\n" +
            "\t\"avatar\": {\n" +
            "\t  \"thumbnail\":\"/thumbs/thumb3.jpg\",\n" +
            "\t  \"photo\":\"/walls/wall3.jpg\"\n" +
            "\t},\n" +
            "    \"address\": {\n" +
            "      \"street\": \"Douglas Extension\",\n" +
            "      \"suite\": \"Suite 847\",\n" +
            "      \"city\": \"McKenziehaven\",\n" +
            "      \"zipcode\": \"59590-4157\",\n" +
            "      \"geo\": {\n" +
            "        \"lat\": \"-68.6102\",\n" +
            "        \"lng\": \"-47.0653\"\n" +
            "      }\n" +
            "    },\n" +
            "    \"phone\": \"1-463-123-4447\",\n" +
            "    \"website\": \"ramiro.info\",\n" +
            "    \"company\": {\n" +
            "      \"name\": \"Romaguera-Jacobson\",\n" +
            "      \"catchPhrase\": \"Face to face bifurcated interface\",\n" +
            "      \"bs\": \"e-enable strategic applications\"\n" +
            "    }\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 4,\n" +
            "    \"name\": \"Patricia Lebsack\",\n" +
            "    \"username\": \"Karianne\",\n" +
            "    \"email\": \"Julianne.OConner@kory.org\",\n" +
            "\t\"avatar\": {\n" +
            "\t  \"thumbnail\":\"/thumbs/thumb4.jpg\",\n" +
            "\t  \"photo\":\"/walls/wall4.jpg\"\n" +
            "\t},\n" +
            "    \"address\": {\n" +
            "      \"street\": \"Hoeger Mall\",\n" +
            "      \"suite\": \"Apt. 692\",\n" +
            "      \"city\": \"South Elvis\",\n" +
            "      \"zipcode\": \"53919-4257\",\n" +
            "      \"geo\": {\n" +
            "        \"lat\": \"29.4572\",\n" +
            "        \"lng\": \"-164.2990\"\n" +
            "      }\n" +
            "    },\n" +
            "    \"phone\": \"493-170-9623 x156\",\n" +
            "    \"website\": \"kale.biz\",\n" +
            "    \"company\": {\n" +
            "      \"name\": \"Robel-Corkery\",\n" +
            "      \"catchPhrase\": \"Multi-tiered zero tolerance productivity\",\n" +
            "      \"bs\": \"transition cutting-edge web services\"\n" +
            "    }\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 5,\n" +
            "    \"name\": \"Chelsey Dietrich\",\n" +
            "    \"username\": \"Kamren\",\n" +
            "    \"email\": \"Lucio_Hettinger@annie.ca\",\n" +
            "\t\"avatar\": {\n" +
            "\t  \"thumbnail\":\"/thumbs/thumb5.jpg\",\n" +
            "\t  \"photo\":\"/walls/wall5.jpg\"\n" +
            "\t},\n" +
            "    \"address\": {\n" +
            "      \"street\": \"Skiles Walks\",\n" +
            "      \"suite\": \"Suite 351\",\n" +
            "      \"city\": \"Roscoeview\",\n" +
            "      \"zipcode\": \"33263\",\n" +
            "      \"geo\": {\n" +
            "        \"lat\": \"-31.8129\",\n" +
            "        \"lng\": \"62.5342\"\n" +
            "      }\n" +
            "    },\n" +
            "    \"phone\": \"(254)954-1289\",\n" +
            "    \"website\": \"demarco.info\",\n" +
            "    \"company\": {\n" +
            "      \"name\": \"Keebler LLC\",\n" +
            "      \"catchPhrase\": \"User-centric fault-tolerant solution\",\n" +
            "      \"bs\": \"revolutionize end-to-end systems\"\n" +
            "    }\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 6,\n" +
            "    \"name\": \"Mrs. Dennis Schulist\",\n" +
            "    \"username\": \"Leopoldo_Corkery\",\n" +
            "    \"email\": \"Karley_Dach@jasper.info\",\n" +
            "\t\"avatar\": {\n" +
            "\t  \"thumbnail\":\"/thumbs/thumb6.jpg\",\n" +
            "\t  \"photo\":\"/walls/wall6.jpg\"\n" +
            "\t},\n" +
            "    \"address\": {\n" +
            "      \"street\": \"Norberto Crossing\",\n" +
            "      \"suite\": \"Apt. 950\",\n" +
            "      \"city\": \"South Christy\",\n" +
            "      \"zipcode\": \"23505-1337\",\n" +
            "      \"geo\": {\n" +
            "        \"lat\": \"-71.4197\",\n" +
            "        \"lng\": \"71.7478\"\n" +
            "      }\n" +
            "    },\n" +
            "    \"phone\": \"1-477-935-8478 x6430\",\n" +
            "    \"website\": \"ola.org\",\n" +
            "    \"company\": {\n" +
            "      \"name\": \"Considine-Lockman\",\n" +
            "      \"catchPhrase\": \"Synchronised bottom-line interface\",\n" +
            "      \"bs\": \"e-enable innovative applications\"\n" +
            "    }\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 7,\n" +
            "    \"name\": \"Kurtis Weissnat\",\n" +
            "    \"username\": \"Elwyn.Skiles\",\n" +
            "    \"email\": \"Telly.Hoeger@billy.biz\",\n" +
            "\t\"avatar\": {\n" +
            "\t  \"thumbnail\":\"/thumbs/thumb7.jpg\",\n" +
            "\t  \"photo\":\"/walls/wall7.jpg\"\n" +
            "\t},\n" +
            "    \"address\": {\n" +
            "      \"street\": \"Rex Trail\",\n" +
            "      \"suite\": \"Suite 280\",\n" +
            "      \"city\": \"Howemouth\",\n" +
            "      \"zipcode\": \"58804-1099\",\n" +
            "      \"geo\": {\n" +
            "        \"lat\": \"24.8918\",\n" +
            "        \"lng\": \"21.8984\"\n" +
            "      }\n" +
            "    },\n" +
            "    \"phone\": \"210.067.6132\",\n" +
            "    \"website\": \"elvis.io\",\n" +
            "    \"company\": {\n" +
            "      \"name\": \"Johns Group\",\n" +
            "      \"catchPhrase\": \"Configurable multimedia task-force\",\n" +
            "      \"bs\": \"generate enterprise e-tailers\"\n" +
            "    }\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 8,\n" +
            "    \"name\": \"Nicholas Runolfsdottir V\",\n" +
            "    \"username\": \"Maxime_Nienow\",\n" +
            "    \"email\": \"Sherwood@rosamond.me\",\n" +
            "\t\"avatar\": {\n" +
            "\t  \"thumbnail\":\"/thumbs/thumb8.jpg\",\n" +
            "\t  \"photo\":\"/walls/wall8.jpg\"\n" +
            "\t},\n" +
            "    \"address\": {\n" +
            "      \"street\": \"Ellsworth Summit\",\n" +
            "      \"suite\": \"Suite 729\",\n" +
            "      \"city\": \"Aliyaview\",\n" +
            "      \"zipcode\": \"45169\",\n" +
            "      \"geo\": {\n" +
            "        \"lat\": \"-14.3990\",\n" +
            "        \"lng\": \"-120.7677\"\n" +
            "      }\n" +
            "    },\n" +
            "    \"phone\": \"586.493.6943 x140\",\n" +
            "    \"website\": \"jacynthe.com\",\n" +
            "    \"company\": {\n" +
            "      \"name\": \"Abernathy Group\",\n" +
            "      \"catchPhrase\": \"Implemented secondary concept\",\n" +
            "      \"bs\": \"e-enable extensible e-tailers\"\n" +
            "    }\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 9,\n" +
            "    \"name\": \"Glenna Reichert\",\n" +
            "    \"username\": \"Delphine\",\n" +
            "    \"email\": \"Chaim_McDermott@dana.io\",\n" +
            "\t\"avatar\": {\n" +
            "\t  \"thumbnail\":\"/thumbs/thumb9.jpg\",\n" +
            "\t  \"photo\":\"/walls/wall9.jpg\"\n" +
            "\t},\n" +
            "    \"address\": {\n" +
            "      \"street\": \"Dayna Park\",\n" +
            "      \"suite\": \"Suite 449\",\n" +
            "      \"city\": \"Bartholomebury\",\n" +
            "      \"zipcode\": \"76495-3109\",\n" +
            "      \"geo\": {\n" +
            "        \"lat\": \"24.6463\",\n" +
            "        \"lng\": \"-168.8889\"\n" +
            "      }\n" +
            "    },\n" +
            "    \"phone\": \"(775)976-6794 x41206\",\n" +
            "    \"website\": \"conrad.com\",\n" +
            "    \"company\": {\n" +
            "      \"name\": \"Yost and Sons\",\n" +
            "      \"catchPhrase\": \"Switchable contextually-based project\",\n" +
            "      \"bs\": \"aggregate real-time technologies\"\n" +
            "    }\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 10,\n" +
            "    \"name\": \"Clementina DuBuque\",\n" +
            "    \"username\": \"Moriah.Stanton\",\n" +
            "    \"email\": \"Rey.Padberg@karina.biz\",\n" +
            "\t\"avatar\": {\n" +
            "\t  \"thumbnail\":\"/thumbs/thumb10.jpg\",\n" +
            "\t  \"photo\":\"/walls/wall10.jpg\"\n" +
            "\t},\n" +
            "    \"address\": {\n" +
            "      \"street\": \"Kattie Turnpike\",\n" +
            "      \"suite\": \"Suite 198\",\n" +
            "      \"city\": \"Lebsackbury\",\n" +
            "      \"zipcode\": \"31428-2261\",\n" +
            "      \"geo\": {\n" +
            "        \"lat\": \"-38.2386\",\n" +
            "        \"lng\": \"57.2232\"\n" +
            "      }\n" +
            "    },\n" +
            "    \"phone\": \"024-648-3804\",\n" +
            "    \"website\": \"ambrose.net\",\n" +
            "    \"company\": {\n" +
            "      \"name\": \"Hoeger LLC\",\n" +
            "      \"catchPhrase\": \"Centralized empowering task-force\",\n" +
            "      \"bs\": \"target end-to-end models\"\n" +
            "    }\n" +
            "  }\n" +
            "]";

    public static final String PREFIX_URL = "https://lebavui.github.io/";
    public static final String API_URL = "https://lebavui.github.io/jsons/users.json";
    public static final String EXTRA_MESSAGE = "EXTRA_MESSAGE";
    private static final String LOG_TAG = "MainActivity";



    ListView listView;
    List<Person> people;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);

        people = parseJson(JSON);
        AdapterPerson adapterPerson = new AdapterPerson(MainActivity.this,
                R.layout.short_info_layout,
                people);
        listView.setAdapter(adapterPerson);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                Person person = people.get(i);
                Log.v(LOG_TAG, "Clicked on person: " + person);
                intent.putExtra(EXTRA_MESSAGE, person);
                startActivity(intent);
            }
        });
    }

    private List<Person> parseJson(String json) {
        try {
            List<Person> people = new ArrayList<>();
            JSONArray jsonArray = new JSONArray(json);
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject personJson = jsonArray.getJSONObject(i);

                Person person = new Person();
                person.setUsername(personJson.getString("username"));
                person.setEmail(personJson.getString("email"));
                person.setPhone(personJson.getString("phone"));
                person.setCompany(personJson.getJSONObject("company").getString("name"));
                person.setName(personJson.getString("name"));

                JSONObject addressJson = personJson.getJSONObject("address");
                person.setAddress(addressJson.getString("street") +
                        addressJson.getString("suite") +
                        addressJson.getString("city"));

                JSONObject avatarJson = personJson.getJSONObject("avatar");
                person.setAvatarUrl(PREFIX_URL + avatarJson.getString("thumbnail"));

                people.add(person);
            }
            return people;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}