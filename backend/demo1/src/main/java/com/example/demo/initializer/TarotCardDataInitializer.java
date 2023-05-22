package com.example.demo.initializer;

import com.example.demo.domain.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.net.URL;

@Component
public class TarotCardDataInitializer implements CommandLineRunner {
    private ProductRepository productRepository;

    @Autowired
    public TarotCardDataInitializer(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void makeTarotCard(String name, String url){
        Product card = new Product();
        card.setTarotName(name);
        card.setUrl(url);
        productRepository.save(card);

    }
    @Override
    public void run(String... args) {
        //트럼프 카드 22장
        makeTarotCard("바보", "https://upload.wikimedia.org/wikipedia/ko/thumb/9/90/RWS_Tarot_00_Fool.jpg/275px-RWS_Tarot_00_Fool.jpg");
        makeTarotCard("마술사","https://upload.wikimedia.org/wikipedia/ko/d/de/RWS_Tarot_01_Magician.jpg");
        makeTarotCard("여교황","https://upload.wikimedia.org/wikipedia/ko/thumb/8/88/RWS_Tarot_02_High_Priestess.jpg/220px-RWS_Tarot_02_High_Priestess.jpg");
        makeTarotCard("여제","https://upload.wikimedia.org/wikipedia/ko/d/d2/RWS_Tarot_03_Empress.jpg");
        makeTarotCard("황제","https://upload.wikimedia.org/wikipedia/ko/c/c3/RWS_Tarot_04_Emperor.jpg");

        makeTarotCard("교황","https://upload.wikimedia.org/wikipedia/ko/8/8d/RWS_Tarot_05_Hierophant.jpg");
        makeTarotCard("연인","https://upload.wikimedia.org/wikipedia/ko/d/db/RWS_Tarot_06_Lovers.jpg");
        makeTarotCard("전차","https://upload.wikimedia.org/wikipedia/ko/9/9b/RWS_Tarot_07_Chariot.jpg");
        makeTarotCard("정의","https://upload.wikimedia.org/wikipedia/ko/e/e0/RWS_Tarot_11_Justice.jpg");
        makeTarotCard("은자","https://upload.wikimedia.org/wikipedia/ko/4/4d/RWS_Tarot_09_Hermit.jpg");
        //10
        makeTarotCard("운명의바퀴","https://upload.wikimedia.org/wikipedia/ko/3/3c/RWS_Tarot_10_Wheel_of_Fortune.jpg");
        makeTarotCard("힘","https://upload.wikimedia.org/wikipedia/ko/f/f5/RWS_Tarot_08_Strength.jpg");
        makeTarotCard("매달린 남자","https://upload.wikimedia.org/wikipedia/ko/2/2b/RWS_Tarot_12_Hanged_Man.jpg");
        makeTarotCard("죽음","https://upload.wikimedia.org/wikipedia/ko/d/d7/RWS_Tarot_13_Death.jpg");
        makeTarotCard("절제","https://upload.wikimedia.org/wikipedia/commons/thumb/b/b7/Luca_Giordano_017.jpg/358px-Luca_Giordano_017.jpg");

        makeTarotCard("악마","https://upload.wikimedia.org/wikipedia/ko/5/55/RWS_Tarot_15_Devil.jpg");
        makeTarotCard("탑","https://upload.wikimedia.org/wikipedia/ko/5/53/RWS_Tarot_16_Tower.jpg");
        makeTarotCard("별","https://upload.wikimedia.org/wikipedia/ko/d/db/RWS_Tarot_17_Star.jpg");
        makeTarotCard("달","https://upload.wikimedia.org/wikipedia/ko/7/7f/RWS_Tarot_18_Moon.jpg");
        makeTarotCard("태양","https://upload.wikimedia.org/wikipedia/ko/thumb/1/17/RWS_Tarot_19_Sun.jpg/277px-RWS_Tarot_19_Sun.jpg");
        //20
        makeTarotCard("심판","https://upload.wikimedia.org/wikipedia/ko/d/dd/RWS_Tarot_20_Judgement.jpg");
        makeTarotCard("세계","https://upload.wikimedia.org/wikipedia/ko/f/ff/RWS_Tarot_21_World.jpg");

        //슈트카드 동전, 봉, 잔, 검 14장씩
        makeTarotCard("동전의 에이스","https://ko.wikipedia.org/wiki/%ED%8C%8C%EC%9D%BC:RWS_Tarot_Pents01.jpg");
        makeTarotCard("동전의 2","https://upload.wikimedia.org/wikipedia/ko/thumb/2/24/RWS_Tarot_Pents02.jpg/69px-RWS_Tarot_Pents02.jpg");
        makeTarotCard("동전의 3","https://upload.wikimedia.org/wikipedia/ko/thumb/b/b1/RWS_Tarot_Pents03.jpg/69px-RWS_Tarot_Pents03.jpg");
        makeTarotCard("동전의 4","https://upload.wikimedia.org/wikipedia/ko/thumb/a/a8/RWS_Tarot_Pents04.jpg/68px-RWS_Tarot_Pents04.jpg");
        makeTarotCard("동전의 5","https://upload.wikimedia.org/wikipedia/ko/thumb/8/83/RWS_Tarot_Pents05.jpg/68px-RWS_Tarot_Pents05.jpg");
        makeTarotCard("동전의 6","https://upload.wikimedia.org/wikipedia/ko/thumb/1/1d/RWS_Tarot_Pents06.jpg/69px-RWS_Tarot_Pents06.jpg");
        makeTarotCard("동전의 7","https://upload.wikimedia.org/wikipedia/ko/thumb/2/22/RWS_Tarot_Pents07.jpg/68px-RWS_Tarot_Pents07.jpg");
        makeTarotCard("동전의 8","https://upload.wikimedia.org/wikipedia/ko/thumb/3/3b/RWS_Tarot_Pents08.jpg/68px-RWS_Tarot_Pents08.jpg");
        makeTarotCard("동전의 9","https://upload.wikimedia.org/wikipedia/ko/thumb/1/1a/RWS_Tarot_Pents09.jpg/69px-RWS_Tarot_Pents09.jpg");
        makeTarotCard("동전의 10","https://upload.wikimedia.org/wikipedia/ko/thumb/5/59/RWS_Tarot_Pents10.jpg/70px-RWS_Tarot_Pents10.jpg");
        makeTarotCard("동전의 시종","https://upload.wikimedia.org/wikipedia/ko/thumb/e/e3/RWS_Tarot_Pents11.jpg/68px-RWS_Tarot_Pents11.jpg");
        makeTarotCard("동전의 기사","https://upload.wikimedia.org/wikipedia/ko/thumb/9/9a/RWS_Tarot_Pents12.jpg/68px-RWS_Tarot_Pents12.jpg");
        makeTarotCard("동전의 여왕","https://upload.wikimedia.org/wikipedia/ko/thumb/9/97/RWS_Tarot_Pents13.jpg/68px-RWS_Tarot_Pents13.jpg");
        makeTarotCard("동전의 왕","https://upload.wikimedia.org/wikipedia/ko/thumb/9/96/RWS_Tarot_Pents14.jpg/69px-RWS_Tarot_Pents14.jpg");

        makeTarotCard("봉의 에이스","https://upload.wikimedia.org/wikipedia/ko/thumb/a/a9/RWS_Tarot_Wands01.jpg/69px-RWS_Tarot_Wands01.jpg");
        makeTarotCard("봉의 2","https://upload.wikimedia.org/wikipedia/ko/thumb/c/cb/RWS_Tarot_Wands02.jpg/69px-RWS_Tarot_Wands02.jpg");
        makeTarotCard("봉의 3","https://upload.wikimedia.org/wikipedia/ko/thumb/7/75/RWS_Tarot_Wands03.jpg/68px-RWS_Tarot_Wands03.jpg");
        makeTarotCard("봉의 4","https://upload.wikimedia.org/wikipedia/ko/thumb/9/91/RWS_Tarot_Wands04.jpg/68px-RWS_Tarot_Wands04.jpg");
        makeTarotCard("봉의 5","https://upload.wikimedia.org/wikipedia/ko/thumb/1/19/RWS_Tarot_Wands05.jpg/68px-RWS_Tarot_Wands05.jpg");
        makeTarotCard("봉의 6","https://upload.wikimedia.org/wikipedia/ko/thumb/5/56/RWS_Tarot_Wands06.jpg/69px-RWS_Tarot_Wands06.jpg");
        makeTarotCard("봉의 7","https://upload.wikimedia.org/wikipedia/ko/thumb/a/aa/RWS_Tarot_Wands07.jpg/68px-RWS_Tarot_Wands07.jpg");
        makeTarotCard("봉의 8","https://upload.wikimedia.org/wikipedia/ko/thumb/0/04/RWS_Tarot_Wands08.jpg/68px-RWS_Tarot_Wands08.jpg");
        makeTarotCard("봉의 9","https://upload.wikimedia.org/wikipedia/ko/thumb/3/38/RWS_Tarot_Wands09.jpg/69px-RWS_Tarot_Wands09.jpg");
        makeTarotCard("봉의 10","https://upload.wikimedia.org/wikipedia/ko/thumb/1/1d/RWS_Tarot_Wands10.jpg/69px-RWS_Tarot_Wands10.jpg");
        makeTarotCard("봉의 시종","https://upload.wikimedia.org/wikipedia/ko/thumb/0/0a/RWS_Tarot_Wands11.jpg/68px-RWS_Tarot_Wands11.jpg");
        makeTarotCard("봉의 기사","https://upload.wikimedia.org/wikipedia/ko/thumb/8/8f/RWS_Tarot_Wands12.jpg/68px-RWS_Tarot_Wands12.jpg");
        makeTarotCard("봉의 여왕","https://upload.wikimedia.org/wikipedia/ko/thumb/4/43/RWS_Tarot_Wands13.jpg/69px-RWS_Tarot_Wands13.jpg");
        makeTarotCard("봉의 왕","https://upload.wikimedia.org/wikipedia/ko/thumb/0/00/RWS_Tarot_Wands14.jpg/67px-RWS_Tarot_Wands14.jpg");

        makeTarotCard("잔의 에이스","https://upload.wikimedia.org/wikipedia/ko/thumb/3/37/RWS_Tarot_Cups01.jpg/67px-RWS_Tarot_Cups01.jpg");
        makeTarotCard("잔의 2","https://upload.wikimedia.org/wikipedia/ko/thumb/e/e5/RWS_Tarot_Cups02.jpg/68px-RWS_Tarot_Cups02.jpg");
        makeTarotCard("잔의 3","https://upload.wikimedia.org/wikipedia/ko/thumb/e/e4/RWS_Tarot_Cups03.jpg/68px-RWS_Tarot_Cups03.jpg");
        makeTarotCard("잔의 4","https://upload.wikimedia.org/wikipedia/ko/thumb/9/91/RWS_Tarot_Cups04.jpg/68px-RWS_Tarot_Cups04.jpg");
        makeTarotCard("잔의 5","https://upload.wikimedia.org/wikipedia/ko/thumb/8/82/RWS_Tarot_Cups05.jpg/67px-RWS_Tarot_Cups05.jpg");
        makeTarotCard("잔의 6","https://upload.wikimedia.org/wikipedia/ko/thumb/1/1c/RWS_Tarot_Cups06.jpg/67px-RWS_Tarot_Cups06.jpg");
        makeTarotCard("잔의 7","https://upload.wikimedia.org/wikipedia/ko/thumb/e/ee/RWS_Tarot_Cups07.jpg/68px-RWS_Tarot_Cups07.jpg");
        makeTarotCard("잔의 8","https://upload.wikimedia.org/wikipedia/ko/thumb/c/c0/RWS_Tarot_Cups08.jpg/68px-RWS_Tarot_Cups08.jpg");
        makeTarotCard("잔의 9","https://upload.wikimedia.org/wikipedia/ko/thumb/5/58/RWS_Tarot_Cups09.jpg/68px-RWS_Tarot_Cups09.jpg");
        makeTarotCard("잔의 10","https://upload.wikimedia.org/wikipedia/ko/thumb/8/82/RWS_Tarot_Cups10.jpg/68px-RWS_Tarot_Cups10.jpg");
        makeTarotCard("잔의 시종","https://upload.wikimedia.org/wikipedia/ko/thumb/8/82/RWS_Tarot_Cups11.jpg/67px-RWS_Tarot_Cups11.jpg");
        makeTarotCard("잔의 기사","https://upload.wikimedia.org/wikipedia/ko/thumb/f/f5/RWS_Tarot_Cups12.jpg/69px-RWS_Tarot_Cups12.jpg");
        makeTarotCard("잔의 여왕","https://upload.wikimedia.org/wikipedia/ko/thumb/a/a6/RWS_Tarot_Cups13.jpg/69px-RWS_Tarot_Cups13.jpg");
        makeTarotCard("잔의 왕","https://upload.wikimedia.org/wikipedia/ko/thumb/0/07/RWS_Tarot_Cups14.jpg/68px-RWS_Tarot_Cups14.jpg");

        makeTarotCard("검의 에이스","https://upload.wikimedia.org/wikipedia/ko/thumb/0/07/RWS_Tarot_Swords01.jpg/68px-RWS_Tarot_Swords01.jpg");
        makeTarotCard("검의 2","https://upload.wikimedia.org/wikipedia/ko/thumb/4/45/RWS_Tarot_Swords02.jpg/69px-RWS_Tarot_Swords02.jpg");
        makeTarotCard("검의 3","https://upload.wikimedia.org/wikipedia/ko/thumb/f/fb/RWS_Tarot_Swords03.jpg/67px-RWS_Tarot_Swords03.jpg");
        makeTarotCard("검의 4","https://upload.wikimedia.org/wikipedia/ko/thumb/2/2c/RWS_Tarot_Swords04.jpg/67px-RWS_Tarot_Swords04.jpg");
        makeTarotCard("검의 5","https://upload.wikimedia.org/wikipedia/ko/thumb/e/e9/RWS_Tarot_Swords05.jpg/68px-RWS_Tarot_Swords05.jpg");
        makeTarotCard("검의 6","https://upload.wikimedia.org/wikipedia/ko/thumb/0/02/RWS_Tarot_Swords06.jpg/69px-RWS_Tarot_Swords06.jpg");
        makeTarotCard("검의 7","https://upload.wikimedia.org/wikipedia/ko/thumb/8/80/RWS_Tarot_Swords07.jpg/69px-RWS_Tarot_Swords07.jpg");
        makeTarotCard("검의 8","https://upload.wikimedia.org/wikipedia/ko/thumb/b/b8/RWS_Tarot_Swords08.jpg/69px-RWS_Tarot_Swords08.jpg");
        makeTarotCard("검의 9","https://upload.wikimedia.org/wikipedia/ko/thumb/e/ea/RWS_Tarot_Swords09.jpg/69px-RWS_Tarot_Swords09.jpg");
        makeTarotCard("검의 10","https://upload.wikimedia.org/wikipedia/ko/thumb/7/72/RWS_Tarot_Swords10.jpg/69px-RWS_Tarot_Swords10.jpg");
        makeTarotCard("검의 시종","https://upload.wikimedia.org/wikipedia/ko/thumb/a/af/RWS_Tarot_Swords11.jpg/68px-RWS_Tarot_Swords11.jpg");
        makeTarotCard("검의 기사","https://upload.wikimedia.org/wikipedia/ko/thumb/f/f8/RWS_Tarot_Swords12.jpg/68px-RWS_Tarot_Swords12.jpg");
        makeTarotCard("검의 여왕","https://upload.wikimedia.org/wikipedia/ko/thumb/5/5f/RWS_Tarot_Swords13.jpg/67px-RWS_Tarot_Swords13.jpg");
        makeTarotCard("검의 왕","https://upload.wikimedia.org/wikipedia/ko/thumb/2/22/RWS_Tarot_Swords14.jpg/68px-RWS_Tarot_Swords14.jpg");
    }
}
