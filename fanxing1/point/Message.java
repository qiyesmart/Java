package point;

/**
 * Author:QiyeSmart
 * Created:2019/4/29
 */
 class Message<T> {
    private T message;

    public void setMessage(T message) {
        this.message = message;
    }

    public T getMessage() {
        return message;
    }

}

