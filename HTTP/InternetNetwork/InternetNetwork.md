# 인터넷 네트워크
##목차
1. [IP](#1.-IP-(Internet-Protocol))
2. [TCP, UDP](#2.-TCP,-UDP)
3. PORT
4. DNS
---

##1. IP (Internet Protocol) 


- ### 인터넷 프로토콜 역할
  - 지정한 IP 주소에 데이터 전달
  - 패킷(Packet)이라는 통신 단위로 데이터 전달

  
- IP 패킷 정보
  - 출발지 IP, 목적지 IP, 전송데이터, ....

  ![client packet](./Image/ip1.png)
  ![server packet](./Image/ip2.png)


- ###IP 프로토콜의 한계
  - 비연결성
  ![unconnected](./Image/ip3.png)
  - 비신뢰성
  ![Loss](./Image/ip4.png)
  ![order](./Image/ip5.png)
  - 프로그램 구분
    - 같은 IP를 사용하는 서버에서 통신하는 애플리케이션이 둘 이상(ex 노래를 들으면서 게임을 하는 상황)
---
    
## 2. TCP, UDP

- 프로토콜 계층
  ![protocol](./Image/tcp1.png)