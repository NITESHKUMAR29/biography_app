package com.example.biography;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import com.example.biography.BiographyAdapters.BiographyAdapter;
import com.example.biography.BiographyModel.BiographyModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements BiographyAdapter.OnItemClickListener{
    RecyclerView recyclerView;
    ArrayList<BiographyModel> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.re);
        list= new ArrayList<>();
        getSupportActionBar().setTitle("GREAT PERSONALITIES");
        list.add(new BiographyModel(R.drawable.apj,"A.P.J Abdul kalam","Dr. APJ Abdul Kalam is a famous name in the whole world. He is counted among the greatest scientists of the 21st century. Even more, he becomes the 11th president of India and served his country. He was the most valued person of the country as his contribution as a scientist and as a president is beyond compare. Apart from that, his contribution to the ISRO (Indian Space Research Organization) is remarkable. He headed many projects that contributed to the society also he was the one who helped in the development of Agni and Prithvi missiles. For his involvement in the Nuclear power in India, he was known as “Missile Man of India”. And due to his contribution to the country, the government awarded him with the highest civilian award.\n" +
                "\n" +
                "Career and Contribution of APJ Abdul Kalam:\n" +
                "\n" +
                "APJ Abdul Kalam was born in Tamil Nadu. At that time the financial condition of his family was poor so from an early age he started supporting his family financially. But he never gave up education. Along with supporting his family he continued his studies and completed graduation. Above all, he was a member of the Pokhran nuclear test conducted in 1998.\n" +
                "\n" +
                "There is a countless contribution of Dr.APJ Abdul Kalam to the country but he was most famous for his greatest contribution that is the development of missiles that goes by the name Agni and Prithvi.\n" +
                "\n" +
                "\n" +
                "Presidency Period:\n" +
                "\n" +
                "The great missile man becomes the President of India in 2002. During his presidency period, the army and country achieved many milestones that contributed a lot to the nation. He served the nation with an open heart that’s why he was called ‘people’s president’. But at the end of his term period, he was not satisfied with his work that’s why he wanted to be the President a second time but later on forfeited his name.\n" +
                "\n" +
                "Post-presidency Period:\n" +
                "\n" +
                "After leaving the presidential office at the end of his term Dr. APJ Abdul Kalam again turn to his old passion which is teaching students. He worked for many renowned and prestigious institute of India located across the country. Above all, according to his the youth of the country is very talented but need the opportunity to prove their worth that’s why he supported them in their every good deed.\n" +
                "\n" +
                "\n" +
                "Awards and Honors:\n" +
                "\n" +
                "During his lifetime Dr. APJ Abdul Kalam was not only awarded and honored by Indian organization and committees but also by many international organizations and committees.\n" +
                "\n" +
                "Writings and Character:\n" +
                "\n" +
                "During his lifetime, Dr. APJ Abdul Kalam wrote many books but his most notable work was ‘India 2020’ which have an action plan to make India a superpower.\n" +
                "\n" +
                "Dr. APJ Abdul Kalam was a man of simplicity and integrity. He was so busy at work that he rises up early in the morning and work till late hours after midnight.\n" +
                "\n" +
                "Death of APJ Abdul Kalam:\n" +
                "\n" +
                "He died during delivering a lecture to students in Shillong by sudden cardiac arrest in 2015. He was an outstanding scientist and a pioneer engineer who served his entire life for the nation and died while serving it. The man had the vision to make India a great country. And according to his the youth are the real assets of the country that’s why we should inspire and motivate them."));
        list.add(new BiographyModel(R.drawable.gandhi,"Mahatma Gandhi","Mahatma Gandhi was a great leader in the real sense. He did not live for self; but spent his whole life for the good of his country and its people. He was a man of firm determination and strong will-power. Undeterred by any opposition or consequences, he pursued his mission single-handedly and was even followed by lakhs and lakhs of people afterwards.\n" +
                "\n" +
                "\n" +
                "Affectionately called ‘Bapu’ by most of his countrymen, Gandhi was born on October 2, 1869 at Porbandar in Gujarat. His full name was Mohan Das Karam Chand Gandhi. During his school days, he was greatly influenced by the characters of King Harish Chandra and Shravan Bhakta.\n" +
                "\n" +
                "While his first model taught him to be truthful in life, the second ideal imparted him the lesson of being obedient to one’s parents.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " \n" +
                "After passing his matriculation in 1887, he went to London to study law and returned to India in 1891. Though he started practice as a lawyer, he met with little success. The main obstacle was his decision not to tell lies, or fabricate facts to win a case.\n" +
                "\n" +
                "His stay in South Africa from 1893 onward, proved to be a turning point in his life. Though his initial law assignment was only for one year, he spent 21 years, fighting against the racial discrimination there. He himself was abused because of his Indian nationality. It was, actually, in South Africa that Gandhi put to test his weapons of Satyagraha and civil disobedience, called ‘Satyagraha’ to awaken the dormant masses.\n" +
                "\n" +
                "He made experiment with community living at the Phoenix Farm and the Tolstoy Farm. There he took upon himself the job of a teacher, a cook, a nurse and a gardener and a scavenger. It was here that he gave a new concept for education.\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                " \n" +
                "Gandhi returned to India in 1915 and soon became an acclaimed leader of the nationalist movement for freedom. He opposed the unjust policies of the British government without any fear or restraint.\n" +
                "\n" +
                "He forced the government to withdraw the Rowlatt bill vehemently, organised protests against the Jallianwala Bagh massacre in Amritsar and marched to the sea to make salt from the water. This was to show his total opposition to the Salt Act.\n" +
                "\n" +
                "Gandhi was a role model of ‘Simple living and high Thinking’. He lived and dressed like a fakir and enjoyed living amongst the poorest of the poor. He did a lot to improve the social status of women, backward classes and fought against untouchability.\n" +
                "\n" +
                "He was also a very good writer. His autobiography ‘My Experiments with Truth’ is a true picture of his life. It was, however, very sad and tragic that this devotee of ‘non-violence’ was shot dead on January 30, 1948. A shocked India and saddened world mourned his death."));
        list.add(new BiographyModel(R.drawable.nehrulegacy,"Jawahar Lal Nehru"," Jawaharlal Nehru is the name that every Indian is aware of. Jawaharlal was quite famous among children. Due to which the children called him ‘Chacha Nehru’. Since he loved children so much the government celebrated his birthday as ‘Children’s Day’. Jawaharlal Nehru was a great leader. He was a person of great love for the country.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Jawaharlal Nehru’s Early Life:\n" +
                "\n" +
                "Jawaharlal Nehru was born on 14th November 1889 in Allahabad (now Prayagraj). His father’s name was Motilal Nehru who was a good lawyer. His father was very rich because of which Nehru got the best education.\n" +
                "\n" +
                "At an early age, he was sent abroad for studies. He studied in two universities of England namely Harrow and Cambridge. He completed his degree in the year 1910.\n" +
                "\n" +
                "Since Nehru was an average guy in his studies he was not much interested in law. He had an interest in politics. Though he later became a lawyer and practiced law in Allahabad High Court. At the age of 24, he got married to Smt. Kamla Devi. They gave birth to a daughter who was named Indira.\n" +
                "\n" +
                "\n" +
                "Jawaharlal Nehru as a Leader:\n" +
                "\n" +
                "Most Noteworthy, Jawaharlal Nehru was the first Prime Minister of India. He was a man of great vision. He was a leader, politician, and writer too. Since he always India to become a successful country he always worked day and night for the betterment of the country. Jawaharlal Nehru was a man of great vision. Most importantly he gave the slogan ‘Araam Haram Hai’.\n" +
                "\n" +
                "Jawaharlal Nehru was a man of peace but he saw how Britishers treated Indians. Due to which he decided to join the freedom movement. He had a love for his country because of which he shook hands with Mahatma Gandhi (Bapu). As a result, he joined the Non-Cooperation movement of Mahatma Gandhi.\n" +
                "\n" +
                "In his freedom struggle, he had to face many challenges. He even went to jail many times. However, his love for the country did not get any less. He fought a great fight which results in Independence. India got its’ Independence on 15th August 1947. Because of Jawaharlal Nehru’s efforts, he was elected as the first prime minister of India.\n" +
                "\n" +
                "\n" +
                "Achievements as a Prime Minister:\n" +
                "\n" +
                "Nehru was a man of modern thinking. He always wanted to make India a more modern and civilized country. There was a difference between the thinking of Gandhi and Nehru. Gandhi and Nehru had different attitudes toward civilization. While Gandhi wanted an ancient India Nehru was of modern India. He always wanted India to go in a forward direction. Despite the cultural and religious differences in India.\n" +
                "\n" +
                "However, there was a pressure of religious freedom in the country. At that time the main motive was to unite the country. With all the pressures Jawaharlal Nehru led the country in scientific and modern efforts.\n" +
                "\n" +
                "Most importantly Jawaharlal Nehru had a great achievement. He changed ancient Hindu cultural. It helped the Hindu widows a lot. The change had given women equal rights like men. The right of inheritance and property.\n" +
                "\n" +
                "Though Nehru was great prime minister a problem stressed him a lot. The Kashmir region that was claimed by both India and Pakistan. He tried to settle the dispute several times but the problem was still there."));
        list.add(new BiographyModel(R.drawable.bhim,"Bhim Rao Ambedker","Dr. Bhim Rao Ambedkar was one of the greatest leaders of India. He was jurist, social worker, writer and educationist’. He fought against untouchability and became the emancipator of the untouchables and crusader for social justice. It was he who drafted the Indian Constitution.\n" +
                "\n" +
                "He was born in Mahu which is now in Madhya Pradesh on April, 14, 1891. He was born in a family of Mahars, the largest untouchable caste at that time. As a child he had bitter experience of untouchability. That was the time when backwards and untouchables were insulted and ill- treated. Dr. Amebedkar proved to be an angel for these poor and down trodden people.\n" +
                "\n" +
                "Ambedkar was brilliant student. He passed his B.A. in 1912. He got scholarship from the benevolent Maharaja of Baroda State. He was under an agreement to serve the state for ten years. He went to America for higher studies. He completed Ph. D. degree from there in 1917. He also studied law.\n" +
                "\n" +
                " \n" +
                "Dr. Ambedkar had to suffer humiliation from time to time at every walk of his life right from his birth whether it was his school or his office. Needless to say that the condition of untouchables was very bad at that time and being a dalit (untouchable) he was ill-treated by his class mates and his teachers in the school.\n" +
                "\n" +
                "He had to sit at the back and also he had no right to touch the board like other students. In his office too, he had to face the contemptuous look of his sub\u00ADordinates. His sub-ordinates never showed courtesy to him. Even the peons declined to serve him a glass of water. He was greatly wounded at heart to see the condition of his community. He took a firm decision to fight for the rights of the untouchables.\n" +
                "\n" +
                "He started his fight with the foundation of ‘Bahiskrit Hitkarini Sabha’ the works of which were to form school for the untouchables’ to form centres for their moral uplift, to open agricultural schools and industrial schools for the economic welfare of the downtrodden people. He organised people of his caste and tried to create a new spirit in them. He advised them to be educated to depend upon themselves.\n" +
                "\n" +
                "He also advised them not to think of themselves as lower caste people and fight for their rights.\n" +
                "\n" +
                "\n" +
                " \n" +
                "Dr. Ambedkar had a good knowledge and organising power. He impressed the freedom fighters and leaders. He made an important place in society. When India became free in 1947 Ambedkar was appointed a minister. He was a progressive man and a great scholar.\n" +
                "\n" +
                "It was therefore the Constituent Assembly of Independent India appointed him the Chairman of the drafting committee to draft the Constitution of India. He completed the Indian Constitution taking great interest with other fellows. His Constitution regarding Indian Constitution could not be forgotten. He passed away on December 6, 1956. He became a Buddhist during his last days of life.\n" +
                "\n" +
                "He had a great tolerance and boldness to face the social problems. Great sufferings regarding untouchability could not change his firm determination to fight it. He was a true son of mother India. When Bharat Ratna, the nation’s highest civilian award, was conferred posthumously on him in 1990, it was rightly seen as a fitting though belated tribute to one of the builders of modern India."));
        list.add(new BiographyModel(R.drawable.nelson_mandela,"Nelson Mandela","All About The Life Of Nelson Mandela:\n" +
                "\n" +
                "Nelson Mandela was born to Henry Mandela, Tembu’ tribal chief in the year 1918. In the year 1944, he got married to a nurse named Evelyn Ntoko Mase. His marriage lasted for twelve good years and ended up in divorce. After two years, in the year 1958 he married a social worker and a political activist named Nomzamo Winnie Madikileza. He divorced her and then got married to a lawyer Graca Machel in the year 1998. He had three children from his 1st marriage and two daughters from his second marriage.\n" +
                "\n" +
                "Talking about his education, Nelson Mandela got his Bachelor degree from South Africa University via distance learning in the year 1941. In the year 1942, he took a degree in law from the Witwatersrand University. In 1948, he started his practice as a lawyer in South Africa.\n" +
                "\n" +
                "Nelson Mandela’s life as a prisoner:\n" +
                "\n" +
                "During the period between 1940’s and 1950’s, he was frequently subjected to police harassments, banning and detention. In 1960, he went underground with a formation of a military wing. In the year 1962, Nelson Mandela was put behind bars for a period of 5 years as he traveled without any valid travel papers. This incident provoked South Africans and called for a strike. After 2 years of his detention, he was charged with disloyalty, that led him to a lifetime life imprisonment.\n" +
                "\n" +
                "His 4 and 1/2 hours of speech given in criticizing racial discrimination is remembered even today. As he was the leader of the entire group, Nelson Mandela suffered with more harsh treatment as compared to others. Mandela spent near about 27 successive years of life in imprisonment. His detention enhanced his political status that led in global movement to release him from sentence.\n" +
                "\n" +
                "During these twenty-seven years, Mandela spent his time in prison. He was kept hidden and aloof from the entire world while he mined limestone and cultivated sea-weed. In the year 1988 Nelson Mandela got hospitalized for tuberculosis. Once he got recovered, he was again returned to jail with lesser strict conditions. In 1990, he got released completely to a observe joyous celebration scenes at abroad and home.\n" +
                "\n" +
                "His life as a politician:\n" +
                "\n" +
                "The political experience of Mandela came after getting enrolled to the college. He worked to secure a Bachelor degree in “Fine Arts”. During his studies, he got nominated as the Representative Council of student political organization. After when he got debarred for his involvement in a protest act in the campus. Due to which, he went to Johannesburg to obtain his BA qualification. After obtaining the degree in the year 1942, Nelson Mandela joined hands with the ANC “African National Congress” at the time of World War II.\n" +
                "\n" +
                "Nelson Mandela made a group with its other ANC members. The primary objective of this group was to transform the ANC into a mass movement. Mandela played an important role in various political endeavors, and a lot of racial movements that were based on the non-violent boycott, civil disobedience, strike, and non-co-operation."));
        list.add(new BiographyModel(R.drawable.sachint,"Sachin Tendulkar","Sachin Tendulkar, known as the God of cricket was born in the city of Mumbai to a middle-class family. Having come from a very humble family, the only tool that Sachin Tendulkar had to achieve his dream was will-power, sacrifices, hard work, determination and dedication. This essay on Sachin Tendulkar will give an insight to millions of people across the world on how hard work and dreaming big can take you to great places. At the age of 16 years, Sachin faced legendary cricketers like Waqar Younis and Wasim Akram and proved his mettle. After having to face such great bowlers, Sachin made it to the Indian cricket team through his talent and competency.\n" +
                "\n" +
                "The great partnership of Sachin Tendulkar and Virendra Sehwag is fondly remembered by cricketers all around the world. There was a time in Indian cricket where if Sachin Tendulkar does not score a century then the team would lose that match. Such was the responsibility that Sachin Tendulkar had on his shoulders to make India win in every cricket match. It is said that bowlers used to be scared to bowl to Sachin Tendulkar not just because of his talent and competency but also because of the kind of respect they had for him as a person. There are plenty of great knocks of Sachin Tendulkar that is remembered, some of which are mentioned below\n" +
                "\n" +
                "\n" +
                " \n" +
                "1. The great knock at Rawalpindi against Pakistan when Sachin scored 141 runs in 135 balls. But the disappointing end was that Pakistan won the match with 12 runs but Tendulkar was declared man of the match for his great innings.\n" +
                "\n" +
                "2. Sachin Tendulkar was the first batsman on the planet to score a double century in one-day internationals. He scored 200 runs in just 147 balls against South Africa in Gwalior in the year 2010. On that day, India scored a massive score of 401 runs by losing just three wickets.\n" +
                "\n" +
                "3. The greatest knocks in the history of cricket was a massive 664 run partnership between Sachin Tendulkar and Vinod Kambli. This inning is considered as a case study for students in cricket training camps.\n" +
                "\n" +
                "4. The most remember innings of Sachin Tendulkar was the Sharjah ODI where he scored 134 runs and ultimately helped India single-handedly win the Sharjah Cup. This day was also a special day for Sachin Tendulkar because it was his birthday.\n" +
                "\n" +
                "Players like Virat Kohli or MS Dhoni is considered as equals to Sachin Tendulkar. But as a true fan of Sachin Tendulkar, we can say that no cricketer in the history would ever come close to the legend of Tendulkar. One of the things that made Sachin great as said by his coach Ramakant was his sheer determination and willpower and also the love for the game of cricket. Sachin stands as a testimony for the gentleman of the game of Cricket. He can be called as the true gentleman of the gentleman sports.\n" +
                "\n" +
                "I would like to conclude by saying that there is no cricketer or in fact sportsman in the whole world who can come even close to the greatness of Sachin. Sachin, in spite of being a great cricketer, is a very humble and down to earth human being. Even after his retirement from international cricket, he continues to serve India by being the Rajya Sabha member. Sachin Tendulkar will not only be remembered for his greatness in the game of Cricket but also for the greatness of his persona and eccentricity."));
        list.add(new BiographyModel(R.drawable.indira_gandhi,"Indira Gandhi","Indira Gandhi in India is known as the ‘Iron lady of India’. After the Lal Bahadur Shastri died, Indira Gandhi became the prime minister if India. Also, she established her worth and became the strongest prime as well as president of the Congress party. When she became the prime minister of India, the congress party was divided. Thus, she overcame all the hurdles and proved her to be the strongest prime minister of India. The Indira Gandhi essay will give you a glimpse of what Indira Gandhi the strongest prime minister of India. \n" +
                "\n" +
                "\n" +
                "Shrimati Indira Gandhi was born on 19th November 1917 at Anand Bhawan in Uttar Pradesh. Indira Gandhi received education in different places because her parents were constantly moving. She received her primary education at Allahabad only. Besides this, she also studied various subjects at Oxford and Shanti Niketan. In 1942, she was married to a Parsi youth by the name of Feroz Gandhi. Her husband died in 1960 and both of them had two sons, Rajiv and Sanjay. \n" +
                "\n" +
                "From her early life only, Indira Gandhi has been a member of the Indian national congress. Also, in 1959, she was elected as the party president of Indian national congress. It was only after her father Pandit Jawaharlal Nehru died she became the minister of information and broadcasting. After the untimely death of then prime minister Lal Bahadur Shastri, Indira Gandhi became the prime minister of India in 1966. She held on to the prime minister office for 17 years. \n" +
                "\n" +
                "\n" +
                "When she was prime minister of India, she led the country to greater heights. Under her leadership in 1971, India defeated Pakistan in the war and broke its back. Additionally, she also nationalized the banks in 1970 and abolished all the privy purses. These two bold steps defined her time as a prime minister of India.\n" +
                "\n" +
                "One major decision of her tenure was yet to come when in 1975, opposition parties revolted against the historical judgment of justice Sinha. Thus, to neutralize the effect of the opposition of the country she declared the state of internal emergency. So, this resulted in a defeat for her in 1977. After this, for two and a half years she remained in hot water and it was in January 1980 that she came back to her position in the midterm poll. \n" +
                "\n" +
                "Indira Gandhi – Second Term\n" +
                "After she returned to the office, she had to face many more challenges. The demand of ‘Khalistan’ was on the rise and it made her restless. This resulted in the attack on the golden temple. Thus, she ordered the army to rescue the Operation and free the temple from terrorists. On 31st October 1984, she was shot dead at her residence by two of her own security guards. \n" +
                "\n" +
                "She was a woman of courage, vision, and foresight. Also, her 20 point program was a bold way in order to bring the prosperity of the poor. She was a woman who made history as a prime minister of India. "));
        list.add(new BiographyModel(R.drawable.lincon,"Abraham Lincoln","Abraham Lincoln, the name in itself speaks volumes. He is considered the greatest president of the United States of America. Historians and Political Scientists consistently rank him as the best American president ever. Above all, the man is renowned for ending slavery in his country. This certainly created a world-wide awareness against the evil of slavery. In the realm of social reform, he is holding a lofty status.\n" +
                "\n" +
                "\n" +
                "Historical Reputation:\n" +
                "\n" +
                "Many surveys of the Presidents of the United States have taken place. Many scholars and experts of the United States took part in such surveys. Most noteworthy, Lincoln is always ranked in the top 3 in such surveys. Furthermore, there has been an organization of Presidential ranking polls since 1948. Abraham Lincoln certainly has the top rating in most of such polls.\n" +
                "\n" +
                "Probably the most famous survey was by Chicago Tribune in 1982. There was a participation of 49 Historians and Political Scientists in that survey. These experts were to rate all the United States Presidents in five categories. The categories were: leadership, crisis management, political skills, appointments, and character/integrity. As was probably the prediction of most people, Lincoln got top place. Most noteworthy, Lincoln got top place in all the categories. This shows his magnificent historical reputation.\n" +
                "\n" +
                "Many social reformers view him as a champion of liberty. He has the description of a classic liberal by historians. He is a role model to liberal intellectuals and human rights organizations. Some of his avid supporters even compare his life to Jesus Christ.\n" +
                "\n" +
                "Get the huge list of more than 500 Essay Topics and Ideas\n" +
                "\n" +
                "Memory and Memorials:\n" +
                "\n" +
                "Abraham Lincoln appears on many postage stamps in the United States. His image also appears on two United States currency denominations. His sculpture on Mount Rushmore is certainly a world-class memorial. Furthermore, his other memorials include Ford’s theatre, Peterson House, and Lincoln Memorial.\n" +
                "\n" +
                "The United States military greatly honors Lincoln. Many believe him to a symbol of national unity and pride. Two United States navy ships bear his name.\n" +
                "\n" +
                "Abraham Lincoln was certainly a legendary American president. Probably everyone believes him to be a global icon of peace. His legacy is a powerful symbol against oppression. Above all, his greatest contribution to mankind is the emancipation of slaves. The forces of evil tried to stop him. However, his legacy became more glorious because of such attempts. Finally, his assassination took place at the hands of evil forces. However, this assassination left him as a national martyr. The name of Abraham Lincoln certainly belongs in the pages of greatness."));
        list.add(new BiographyModel(R.drawable.kalpana,"Kalpana Chawla","Kalpana was the First spacewoman of India. It was the dream that many Indians dreamt of but only Kalpana was able to fulfill it. She had various ambitions in minds from her childhood only. Moreover, she always had an interest in aircraft, and because of that, she took aeronautical engineering.\n" +
                "\n" +
                "\n" +
                "Furthermore, Kalpana was a woman of great patience and hard work. And she proved that nothing is impossible if you have true dedication for your work. According to her teachers, Kalpna always had a great interest in Science.\n" +
                "\n" +
                "Also, she had the ambition to go into space. So from the beginning only she was aiming to become an astronaut. In spite of knowing that it is a really difficult field. Therefore her father always encouraged her to go for higher studies.\n" +
                "\n" +
                "Life Story of Kalpana Chawla:\n" +
                "\n" +
                "Kalpana was born in Karnal which is a small town in Haryana. Furthermore, she went to a local school to complete her primary studies. Kalpana was always a diligent student. Moreover, she was good in her academics. After completing her schooling Kalpana went to college for graduation. She took admission in Punjab University. She took admission in Aeronautical engineering.\n" +
                "\n" +
                "Most Noteworthy is that she was the only girl student in the entire batch. This signifies that she always took a different path from others and was a leader. Furthermore, after completing her graduation she went abroad for further studies.\n" +
                "\n" +
                "\n" +
                "\n" +
                "She took admission at Texas University in America. And completed her post-graduation from there. To get a doctorate degree she joined Colorado University. After getting the doctorate degree she began her career in NASA’s Ames Research Centre.\n" +
                "\n" +
                "After completing her real career started. In 1994 she became a space passenger in NASA. Further one year later she became a member of space zone too. Kalpana always had a dream of landing on the moon. And as a result of her hard work and dedication, she reached such heights.\n" +
                "\n" +
                "Kalpana’s first space mission was on November 19, 1994. She was a part of 6 member crew on space shuttle Columbia Flight STS-87. Furthermore, she lived for around 375 hours and traveled over 6.5 million miles in space. But when she was returning to Earth the space shuttle disintegrated. Thus the lives of all the 7 crew members ended which Kalpana a part was of. Therefore her career ended sooner than expected.\n" +
                "\n" +
                "Get the huge list of more than 500 Essay Topics and Ideas\n" +
                "\n" +
                "Death of Kalpana Chawla:\n" +
                "\n" +
                "The Death of Kalpana Chawla struck sadness in the minds of Indians. Yet she will always be a great inspiration for all the Indian women. As she became a role model of all the youth. The youth who have always dreamt of doing something great in their lives. Furthermore, it also gives us a message that we should not confine ourselves within boundaries.\n" +
                "\n" +
                "Moreover, we should see life as an opportunity to fulfill our dreams. Kalpana always took life as a challenge and an opportunity. Because of this only she was able to achieve such heights.\n" +
                "\n" +
                "Also, it tells us that everything is possible through hard work and dedication. In her graduation days, she was the only woman in her batch. But this did not deviate her from achieving her dreams. At last, her story always inspires us as Indians and makes us proud."));
        list.add(new BiographyModel(R.drawable.rajendra,"Dr Rajendra Prasad","Dr. Rajendra Prasad was born on 3rd December 1884. He was the first President of India and first President of the Constituent Assembly. He served as President of Indian National Congress in 1934. He followed Mohandas Karamchand Gandhi. He was his disciple and has a lot of contribution in India’s freedom struggle. He was a teacher, a lawyer and a role model for many of us.\n" +
                "\n" +
                "Childhood:\n" +
                "Rajendra Prasad was born in Bihar to Mahadev Sahai, a scholar of both Persian and Sanskrit language and Kamleshwari Devi, a religious woman. He was the youngest of all his siblings. He was very attached to his mother and elder brother Mohendra.\n" +
                "\n" +
                "Education:\n" +
                "Rajendra Prasad studied Persian, Hindi and Arithmetic. He was a brilliant student. In 1902, he stood first in the entrance examination for Calcutta University to take admission in Presidency College and got monthly scholarship too. Later he changed his focus from Science to Arts and completed dual master degrees in Arts in Economics and Law and passed with first division and won gold medal too. In 1937, he completed his Doctorate in Law from Allahabad University. He was a dedicated and sincere student and an active member of the dawn society. He was instrumental and a great politician. He formed Bihari student’s conference in 1906 in Patna College.\n" +
                "\n" +
                " \n" +
                "Career:\n" +
                "Dr. Rajendra Prasad wished to pursue his career as a teacher and for that matter he served in various educational institutions. He became a professor of English at Langat Singh college of Muzzafarpur and progressed to become the principal. After that he served Calcutta City College as a Professor of Economics.  In 1916, he joined the court of Bihar and Orissa (now Odisha). He was appointed as the member of Senate and Syndicate of the Patna University. He had many literary contributions too like Satyagraha at Champaran, Atmakatha, Mahatma Gandhi and Bihar, Some Reminiscences, Bapu ke Kadmon Mein, Since Independence and Bharitya Shiksha.\n" +
                "\n" +
                "After becoming the disciple of Gandhiji, Dr. Rajendra Prasad, got engrossed in freedom struggle. He played an active role during Non-Cooperation Movement and got arrested in 1931 while participating in Salt Satyagraha. As soon as Dr. Rajendra Prasad was released from the jail he immediately set himself for the task of raising funds. Again in 1942, he was arrested for his active participation in Quit India Movement.\n"));
        list.add(new BiographyModel(R.drawable.teresa,"Mother Teresa","There are many humanitarian in the history of the world. Out of the blue, Mother Teresa stood in that crowd of people. She is a lady of great caliber who spends her whole life serving the poor and needy people. Although she was not an Indian still she came to India to help its people. Above all, in this essay on Mother Teresa, we are going to discuss the various aspects of her life.\n" +
                "\n" +
                "Mother Teresa was not his actual name but after becoming a nun she received this name from the church after the name of St. Teresa. By birth, she was a Christian and a great believer of God. And due to this reason, she chooses to become a Nun.\n" +
                "\n" +
                "\n" +
                "The Beginning of Mother Teresa’s Journey:\n" +
                "\n" +
                "Since she was born in a Catholic Christian family she was a great believer of God and humanity. Although she spends most of her life in the church she never imagines herself to be a nun one day. When she visited Kolkata (Calcutta), India after completing her work in Dublin her life completely changed. For 15 consecutive years, she enjoyed teaching children.\n" +
                "\n" +
                "Along with, teaching school children she worked hard to teach the poor kids of that area. She started her journey of humanity by opening an open-air school where she started teaching poor children. For years she worked alone without any funds but still continues to teach students.\n" +
                "\n" +
                "Her Missionary:\n" +
                "\n" +
                "For doing this great work of teaching poor and helping needy people she wants a permanent place. This place will serve as her headquarters and a place where poor and homeless can take shelter.\n" +
                "\n" +
                "So, with the help of the church and the people, she established a missionary where poor and homeless can live and die in peace. Later on, she manages to open several schools, homes, dispensaries, and hospitals through her NGO both in India and overseas countries.\n" +
                "\n" +
                "\n" +
                "Death of Mother Teresa and Memorial:\n" +
                "\n" +
                "She was an angel of hope for the people but death spares no one. And this gem died serving people in Kolkata (Calcutta). Also, on her death the whole nation shred tears in her memory. With her death the poor, needy, homeless, and weak again become orphans.\n" +
                "\n" +
                "Many memorials were made in her honor by the Indian people. Apart from that, foreign countries also make several memorials to give tribute to her.\n" +
                "\n" +
                "\n" +
                "\n" +
                "In conclusion, we can say that in the beginning, it was a difficult task for her to manage and teach poor children. But, she manages those hardships delicately.\n" +
                "In the beginning, of her journey, she uses to teach poor kids using a stick by writing on the ground. But after years of struggle, she finally manages to arrange the necessary things for teaching with the help of volunteers and some teachers.\n" +
                "\n" +
                "Later on, she established a dispensary for poor people to die in peace. Due to her good deeds, she earns great respect in the heart of Indians."));
        list.add(new BiographyModel(R.drawable.nitesh,"Nitesh Kumar","Android developer"));
      BiographyAdapter adapter=new BiographyAdapter(list,this);
       recyclerView.setAdapter(adapter);
       adapter.setOnItemClickListener(MainActivity.this);
      //  LinearLayoutManager layoutManager=new LinearLayoutManager(this);
       // recyclerView.setLayoutManager(layoutManager);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    @Override
    public void onItemClick(int position) {
        Intent intent=new Intent(this,MainActivity2.class);

        BiographyModel biographyModel=list.get(position);
        intent.putExtra("image",biographyModel.getPic());
        intent.putExtra("text",biographyModel.getName());
        intent.putExtra("description",biographyModel.getDescription());
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(MainActivity.this)
        .setIcon(R.drawable.ic_baseline_warning_24)
        .setTitle("EXIT")
        .setMessage("are you sure want to exit Biography")
        .setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();

            }
        }).setNeutralButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();

            }
        }).show();

    }
}