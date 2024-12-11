from flask import Flask

app = Flask(__name__)

@app.route("/")
def hello():
    return "Hello, World"

@app.route("/test2")
def hello2():
    return "World"

# python 코드가 직접 실행인지 아니면 다른 모듈에 의해서 
# import 되었는 지를 판단하는데 사용
if __name__ == '__main__': # 조건을 만족하면 직접 실행
    app.run(debug=True)