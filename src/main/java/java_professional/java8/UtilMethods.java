package java_professional.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.StreamSupport;

import static java.util.stream.Collectors.toList;
import static java.util.stream.StreamSupport.stream;

public class UtilMethods {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        List<Integer> userIds = getIds(users);
        List<String> userNames = getAtributes(users, User::getName);

        List<Product> products = new ArrayList<>();

        List<Integer> productIds = getIds(products);
        List<Integer> productPrices = getAtributes(products, new Function<Product, Integer>() {
            @Override
            public Integer apply(Product product) {
                return product.getPrice();
            }
        });

    }

    static <T extends AbstractEntity> List<Integer> getIds(Iterable<T> entities) {
        return stream(entities.spliterator(), false)
                .map(entity -> entity.id)
                .collect(toList());
    }

    static <T, R> List<R> getAtributes(Iterable<T> entities, Function<T, R> function) {
        return stream(entities.spliterator(), false)
                .map(function)
//                .map(p -> p.getName())
                .collect(toList());
    }

    static class AbstractEntity {
        protected Integer id;
    }

    static class User extends AbstractEntity {
        private String name;
        private Integer age;
        private List<Integer> productIds;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public List<Integer> getProductIds() {
            return productIds;
        }

        public void setProductIds(List<Integer> productIds) {
            this.productIds = productIds;
        }
    }

    static class Product extends AbstractEntity {
        private String name;
        private Integer price;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }
    }
}
